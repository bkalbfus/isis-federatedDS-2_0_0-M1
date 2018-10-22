package domainapp.dom.impl;

import javax.jdo.query.*;
import org.datanucleus.api.jdo.query.*;

public class QHelloOtherWorldObject extends PersistableExpressionImpl<HelloOtherWorldObject> implements PersistableExpression<HelloOtherWorldObject>
{
    public static final QHelloOtherWorldObject jdoCandidate = candidate("this");

    public static QHelloOtherWorldObject candidate(String name)
    {
        return new QHelloOtherWorldObject(null, name, 5);
    }

    public static QHelloOtherWorldObject candidate()
    {
        return jdoCandidate;
    }

    public static QHelloOtherWorldObject parameter(String name)
    {
        return new QHelloOtherWorldObject(HelloOtherWorldObject.class, name, ExpressionType.PARAMETER);
    }

    public static QHelloOtherWorldObject variable(String name)
    {
        return new QHelloOtherWorldObject(HelloOtherWorldObject.class, name, ExpressionType.VARIABLE);
    }

    public final StringExpression name;
    public final StringExpression notes;

    public QHelloOtherWorldObject(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.name = new StringExpressionImpl(this, "name");
        this.notes = new StringExpressionImpl(this, "notes");
    }

    public QHelloOtherWorldObject(Class type, String name, ExpressionType exprType)
    {
        super(type, name, exprType);
        this.name = new StringExpressionImpl(this, "name");
        this.notes = new StringExpressionImpl(this, "notes");
    }
}
