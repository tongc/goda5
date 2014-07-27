package com.goda5.hagendaz.common;

import static org.junit.Assert.*;

import java.util.Date;

import mockit.NonStrictExpectations;
import mockit.integration.junit4.JMockit;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JMockit.class)
public class DynamicPartialMockingTest
{
   static class Collaborator
   {
      final int value;

      Collaborator() { value = -1; }
      Collaborator(int value) { this.value = value; }

      int getValue() { return value; }
      final boolean simpleOperation(int a, String b, Date c) { return true; }
      static void doSomething(boolean b, String s) { throw new IllegalStateException(); }
      
      int anotherValue() {return 5;}
   }
   
   Collaborator collaborator = null;
   
   @Before
   public void setup() {
	   collaborator = new Collaborator(2);
   }

   @Test
   public void partialMockingOfAClassAndAllItsInstances()
   {
      final Collaborator anyInstance = new Collaborator();

      new NonStrictExpectations(Collaborator.class) {{
         anyInstance.getValue(); result = 123;
      }};

      // Mocked:
      Collaborator c1 = new Collaborator();
      assertEquals(123, c1.getValue());

      // Also mocked:
      Collaborator c2 = new Collaborator(150);
      assertEquals(123, c2.getValue());

      // Not mocked:
      assertTrue(c1.simpleOperation(1, "b", null));
      assertEquals(45, new Collaborator(45).value);
   }

   @Test
   public void partialMockingOfASingleInstance()
   {
      new NonStrictExpectations(collaborator) {{
         collaborator.getValue(); result = 123;
         collaborator.simpleOperation(1, "", null); result = false;

         // Static methods can be dynamically mocked too.
         Collaborator.doSomething(anyBoolean, "test");
      }};

      // Mocked:
      assertEquals(123, collaborator.getValue());
      assertFalse(collaborator.simpleOperation(1, "", null));
      Collaborator.doSomething(true, "test");

      // Not mocked:
      assertEquals(2, collaborator.value);
      assertEquals(45, new Collaborator(45).getValue());
      assertEquals(-1, new Collaborator().getValue());
      assertEquals(5, collaborator.anotherValue());
   }
}
