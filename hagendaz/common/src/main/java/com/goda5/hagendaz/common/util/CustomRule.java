package com.goda5.hagendaz.common.util;

import java.util.List;

import org.springframework.web.servlet.ModelAndView;

import net.sourceforge.pmd.AbstractJavaRule;
import net.sourceforge.pmd.PMD;
import net.sourceforge.pmd.ast.ASTArguments;
import net.sourceforge.pmd.ast.ASTBlock;
import net.sourceforge.pmd.ast.ASTClassOrInterfaceType;
import net.sourceforge.pmd.ast.ASTMethodDeclarator;
import net.sourceforge.pmd.ast.ASTName;
import net.sourceforge.pmd.ast.ASTIfStatement;
import net.sourceforge.pmd.ast.ASTMethodDeclaration;
import net.sourceforge.pmd.ast.ASTPrimaryPrefix;
import net.sourceforge.pmd.ast.ASTResultType;
import net.sourceforge.pmd.ast.ASTReturnStatement;
import net.sourceforge.pmd.ast.ASTStatement;
import net.sourceforge.pmd.ast.ASTStatementExpression;
import net.sourceforge.pmd.ast.ASTVariableDeclarator;
import net.sourceforge.pmd.ast.ASTVariableDeclaratorId;
import net.sourceforge.pmd.ast.SimpleJavaTypeNode;

public class CustomRule extends AbstractJavaRule {
	/*
	 * (non-Javadoc)
	 * @see net.sourceforge.pmd.AbstractJavaRule#visit(net.sourceforge.pmd.ast.ASTMethodDeclaration, java.lang.Object)
	 */
	@Override
	public Object visit(ASTMethodDeclaration node, Object data) {
		printAllChildrenTypes(node);
		
		List<ASTVariableDeclarator> children = node.findChildrenOfType(ASTVariableDeclarator.class);
		
		List<ASTName> aaa = node.findChildrenOfType(ASTName.class);
		for(ASTName a:aaa) {
			System.out.println("~~~~~~~~~~" + a.getImage());
		}
		
		List<ASTVariableDeclaratorId> bbb = node.findChildrenOfType(ASTVariableDeclaratorId.class);
		for(ASTVariableDeclaratorId b:bbb) {
			System.out.println("~~~~~~" + b.getImage());
		}
		
		System.out.println(children.size());
		for(ASTVariableDeclarator child:children) {
			System.out.println(child.getLabel() + " " + child.getImage() + " " + child.getClass() + child.getType());
			System.out.println("tttttt" + child.jjtGetChild(0).getClass());
			System.out.println("tttttt" + child.jjtGetChild(1).getClass());
		}
		
		List<ASTArguments> children1 = node.findChildrenOfType(ASTArguments.class);
		System.out.println(children1.size());
		for(ASTArguments child:children1) {
			System.out.println(child.getLabel() + " " + child.getImage() + " " + child.getClass() + child.getArgumentCount());
		}
		
		List<ASTStatement> ccccc = node.findChildrenOfType(ASTStatement.class);
		for(ASTStatement child:ccccc) {
			System.out.println("#####" + child.jjtGetNumChildren());
			System.out.println(((ASTStatementExpression)child.jjtGetChild(0)).jjtGetNumChildren());
			System.out.println("#####" + ((ASTStatementExpression)child.jjtGetChild(0)).jjtGetChild(0).getClass());
			System.out.println("#####" + ((ASTStatementExpression)child.jjtGetChild(0)).jjtGetChild(0).jjtGetChild(0).getClass());
		}
		
		/*
		System.out.println(data);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@" + node.getResultType());
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@" + node.getMethodName());
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@555" + node.getLabel());
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@555" + node.asXml());
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@555" + node.isFinal());
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@555" + node.isAbstract());
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@555" + node.isNative());
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@555" + node.isPublic());
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@555" + node.isAbstract());
		
		List<ASTReturnStatement> isl = node.findChildrenOfType(ASTReturnStatement.class);
		System.out.println("return statement count " + isl.size());
		
		List<ModelAndView> mvs = node.findChildrenOfType(ModelAndView.class);
		
		System.out.println("Num of children " + node.jjtGetNumChildren());
		
		System.out.println("11111111aaaaaaa§" + node.jjtGetChild(0).getClass());
		System.out.println("11111111aaaaaaa§" + ((ASTResultType) node.jjtGetChild(0)).getImage());
		System.out.println("11111111aaaaaaa§" + node.jjtGetChild(1).getClass());
		System.out.println("11111111aaaaaaa§" + ((ASTMethodDeclarator) node.jjtGetChild(1)).getImage());
		System.out.println("11111111aaaaaaa§" + node.jjtGetChild(2).getClass());
		System.out.println("11111111aaaaaaa§" + ((ASTBlock) node.jjtGetChild(2)).getImage());
		
		System.out.println("iiiiiiiiiii" + ((ASTBlock) node.jjtGetChild(2)).jjtGetChild(0).getClass());
		System.out.println("iiiiiiiiiii" + ((ASTBlock) node.jjtGetChild(2)).jjtGetChild(1).getClass());
		*/
		return node;
	}
	
	public void printAllChildrenTypes(net.sourceforge.pmd.ast.Node node) {
		for(int i=0;i<node.jjtGetNumChildren();i++) {
			System.out.println(node.jjtGetChild(i).getClass());
			printAllChildrenTypes(node.jjtGetChild(i));
		}
	}
	
	public static void main(String[] args) {
		PMD pmd = new PMD();
		String[] params = new String[]{"/Users/tonchen/git/goda5/hagendaz/common/src/test/java/com/goda5/hagendaz/common/util/", "xml", "/Users/tonchen/git/goda5/hagendaz/common/src/main/resources/pmd.xml"};
		pmd.main(params);
	}
}
