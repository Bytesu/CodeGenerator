package ${basePackage}.service<#if (sign??||sign=="")>.${sign}</#if> ;
import ${basePackage}.entity<#if (sign!=null||sign=="")>.${sign}</#if>.${modelNameUpperCamel};
import ${serviceInterfaceReference};

/**
 *
 * Created by ${author} on ${date}.
 */
public interface ${modelNameUpperCamel}Service extends Service<${modelNameUpperCamel}> {

}
