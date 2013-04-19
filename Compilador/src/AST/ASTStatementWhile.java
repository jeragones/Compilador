/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author GeOrge
 */
public class ASTStatementWhile extends ASTStatement {
    String whil;
    String PARENT_on;
    ASTExp2 Exp;
    String PARENT_off;
    ASTStatement statement;
}
