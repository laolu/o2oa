/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package com.x.component.core.entity;

import com.x.base.core.entity.SliceJpaObject_;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;

@javax.persistence.metamodel.StaticMetamodel
(value=com.x.component.core.entity.Component.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Sun Sep 02 18:43:35 CST 2018")
public class Component_ extends SliceJpaObject_  {
    public static volatile ListAttribute<Component,String> allowList;
    public static volatile ListAttribute<Component,String> denyList;
    public static volatile SingularAttribute<Component,String> iconPath;
    public static volatile SingularAttribute<Component,String> id;
    public static volatile SingularAttribute<Component,String> name;
    public static volatile SingularAttribute<Component,Integer> orderNumber;
    public static volatile SingularAttribute<Component,String> path;
    public static volatile SingularAttribute<Component,String> title;
    public static volatile SingularAttribute<Component,Boolean> visible;
}
