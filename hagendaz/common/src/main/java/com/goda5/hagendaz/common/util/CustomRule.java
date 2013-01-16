package com.goda5.hagendaz.common.util;

import java.util.List;

import org.springframework.web.servlet.ModelAndView;

import net.sourceforge.pmd.AbstractJavaRule;
import net.sourceforge.pmd.PMD;
import net.sourceforge.pmd.ast.ASTName;
import net.sourceforge.pmd.ast.ASTIfStatement;
import net.sourceforge.pmd.ast.ASTMethodDeclaration;

public class CustomRule extends AbstractJavaRule {
	/*
	 * (non-Javadoc)
	 * @see net.sourceforge.pmd.AbstractJavaRule#visit(net.sourceforge.pmd.ast.ASTMethodDeclaration, java.lang.Object)
	 */
	@Override
	public Object visit(ASTMethodDeclaration node, Object data) {
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
		
		List<ASTIfStatement> isl = node.findChildrenOfType(ASTIfStatement.class);
		System.out.println("22222222222" + isl.size());
		
		List<ModelAndView> mvs = node.findChildrenOfType(ModelAndView.class);
		
		System.out.println("22222222222" + mvs.size());
		
		node.findChildrenOfType(ASTIfStatement.class);
		
		System.out.println("bbbbbbbb" + node.jjtGetNumChildren());
		
		System.out.println("ccccccc" + node.findChildrenOfType(Object.class));
		
		System.out.println("aaaaaaaa" + ((ASTName) node.jjtGetChild(0)).getImage());
		
		ASTIfStatement is = isl.get(0);
		System.out.println("11111111111class type " + is.getClass());
		
		if (node.getResultType().isVoid()) {
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@11111" + node.getResultType());
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@33333" + node.getImage());
			return super.visit(node, data);
		} else {
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@22222" + node.getResultType());
		}
		return node;
	}
	
	public static void main(String[] args) {
		PMD pmd = new PMD();
		String[] params = new String[]{"/work/git/goda5/hagendaz/common/src/test/java/com/goda5/hagendaz/common/util/", "xml", "/work/git/goda5/hagendaz/common/src/main/resources/pmd.xml"};
		pmd.main(params);
	}
}
