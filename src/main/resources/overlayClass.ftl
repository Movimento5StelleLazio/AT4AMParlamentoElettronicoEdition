<#-- @ftlvariable name="overlayClass" type="org.nsesa.editor.app.xsd.model.OverlayClass" -->
package ${packageNameGenerator.getPackageName(overlayClass)};

<#list overlayClass.properties as prop>
import ${packageNameGenerator.getPackageName(prop)}.${prop.className?cap_first};
</#list>
<#list overlayClass.getImports(packageNameGenerator) as import>
import ${import};
</#list>
import com.google.gwt.dom.client.Element;
import java.util.ArrayList;
<#if overlayClass.complex || overlayClass.element>
import org.nsesa.editor.gwt.core.client.ui.overlay.document.AmendableWidgetImpl;
</#if>
/**
* This file is generated.
*/
public class ${overlayClass.className?cap_first} <#if overlayClass.parent??>extends ${overlayClass.parent.className?cap_first}<#else><#if overlayClass.complex || overlayClass.element>extends AmendableWidgetImpl</#if></#if>  <#if overlayClass.interfaces??>implements <#list overlayClass.interfaces as interface>${interface.getSimpleName()}<#if interface_has_next>, </#if></#list> </#if>{

// CONSTRUCTORS ------------------
<#if overlayClass.complex || overlayClass.element>
public ${overlayClass.name?cap_first}(Element element) {
    super(element);
}
</#if>

// FIELDS ------------------
<#list overlayClass.properties as property>
    <@generateField property=property/>
</#list>

<#list overlayClass.properties as property>
public <@propertyClassName property=property/> <#if property.className?cap_first == "Boolean">is<#else>get</#if><@propertyNameCap property = property/>() {
return <@propertyName property = property/>;
}

public void set<@propertyNameCap property = property/>(final <@propertyClassName property=property/> <@propertyName property = property/>) {
this.<@propertyName property = property/> = <@propertyName property = property/>;
}

</#list>
}

<#macro propertyClassName property><#compress>
    <#if property.collection>
    java.util.List<${property.className?cap_first}>
    <#else>
    ${property.className?cap_first}
    </#if>
</#compress></#macro>

<#macro propertyName property><#compress>
    <#if property.name == "class">
    className
    <#elseif property.name == "extends">
    extendz
    <#elseif property.name == "for">
    forURI
    <#elseif property.name == "new">
    newEl
    <#else>
        <#if property.collection><@pl property=property/><#else>${property.name}</#if>
    </#if>
</#compress></#macro>

<#macro propertyNameCap property><#compress>
    <#if property.name == "class">
    ClassName
    <#else>
    ${property.name?cap_first}
    </#if>
</#compress></#macro>

<#macro generateField property>
private <@propertyClassName property=property/> <#if property.collection><@pl property=property/> = new ArrayList<${property.className?cap_first}>();<#else><@propertyName property = property/>;</#if>
</#macro>

<#macro pl property><#compress>
    <#if property.name?ends_with("y")>${property.name?substring(0, property.name?length - 1)}ies<#elseif property.name?ends_with("s")>${property.name}es<#else>${property.name}s</#if>
</#compress></#macro>