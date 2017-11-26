package ${basePackage}.service.impl<#if (sign!=null||sign=="")>.${sign}</#if>;

import ${basePackage}.mapper<#if (sign!=null||sign=="")>.${sign}</#if>.${modelNameUpperCamel}Mapper;
import ${basePackage}.entity<#if (sign!=null||sign=="")>.${sign}</#if>.${modelNameUpperCamel};
import ${basePackage}.service<#if (sign!=null||sign=="")>.${sign}</#if>.${modelNameUpperCamel}Service;
import ${ABSTRACT_SERVICE_CLASS_REFERENCE};
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * Created by ${author} on ${date}.
 */
@Service
public class ${modelNameUpperCamel}ServiceImpl extends AbstractService<${modelNameUpperCamel}> implements ${modelNameUpperCamel}Service {

    @Autowired
    private ${modelNameUpperCamel}Mapper ${modelNameLowerCamel}Mapper;

}
