package io.swagger.codegen.v3.generators.html;

import java.util.HashMap;
import java.util.HashSet;
import io.swagger.codegen.v3.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StaticHtmlNHSCodegen extends StaticHtml2Codegen implements CodegenConfig {
    private static final Logger LOGGER = LoggerFactory.getLogger(StaticHtmlNHSCodegen.class);

    protected String invokerPackage = "io.swagger.client"; // default for Java and Android
    protected String phpInvokerPackage = "Swagger\\Client"; // default for PHP
    protected String packageName = "IO.Swagger"; // default for C#
    protected String groupId = "io.swagger";
    protected String artifactId = "swagger-client";
    protected String artifactVersion = "1.0.0";
    protected String jsProjectName;
    protected String jsModuleName;
    protected String perlModuleName = "WWW::SwaggerClient";
    protected String pythonPackageName = "swagger_client";

    public StaticHtmlNHSCodegen() {
        super();
        outputFolder = "docs";

        defaultIncludes = new HashSet<String>();

        cliOptions.add(new CliOption("appName", "short name of the application"));
        cliOptions.add(new CliOption("appDescription", "description of the application"));
        cliOptions.add(new CliOption("infoUrl", "a URL where users can get more information about the application"));
        cliOptions.add(new CliOption("infoEmail", "an email address to contact for inquiries about the application"));
        cliOptions.add(new CliOption("licenseInfo", "a short description of the license"));
        cliOptions.add(new CliOption("licenseUrl", "a URL pointing to the full license"));
        cliOptions.add(new CliOption(CodegenConstants.INVOKER_PACKAGE, CodegenConstants.INVOKER_PACKAGE_DESC));
        cliOptions.add(new CliOption(CodegenConstants.PHP_INVOKER_PACKAGE, CodegenConstants.PHP_INVOKER_PACKAGE_DESC));
        cliOptions.add(new CliOption(CodegenConstants.PERL_MODULE_NAME, CodegenConstants.PERL_MODULE_NAME_DESC));
        cliOptions.add(new CliOption(CodegenConstants.PYTHON_PACKAGE_NAME, CodegenConstants.PYTHON_PACKAGE_NAME_DESC));
        cliOptions.add(new CliOption(CodegenConstants.PACKAGE_NAME, "C# package name"));
        cliOptions.add(new CliOption(CodegenConstants.GROUP_ID, CodegenConstants.GROUP_ID_DESC));
        cliOptions.add(new CliOption(CodegenConstants.ARTIFACT_ID, CodegenConstants.ARTIFACT_ID_DESC));
        cliOptions.add(new CliOption(CodegenConstants.ARTIFACT_VERSION, CodegenConstants.ARTIFACT_VERSION_DESC));

        additionalProperties.put("appName", "Swagger Sample");
        additionalProperties.put("appDescription", "A sample swagger server");
        additionalProperties.put("infoUrl", "https://helloreverb.com");
        additionalProperties.put("infoEmail", "hello@helloreverb.com");
        additionalProperties.put("licenseInfo", "All rights reserved");
        additionalProperties.put("licenseUrl", "http://apache.org/licenses/LICENSE-2.0.html");
        additionalProperties.put(CodegenConstants.INVOKER_PACKAGE, invokerPackage);
        additionalProperties.put(CodegenConstants.PHP_INVOKER_PACKAGE, phpInvokerPackage);
        additionalProperties.put(CodegenConstants.PERL_MODULE_NAME, perlModuleName);
        additionalProperties.put(CodegenConstants.PYTHON_PACKAGE_NAME, pythonPackageName);
        additionalProperties.put(CodegenConstants.PACKAGE_NAME, packageName);
        additionalProperties.put(CodegenConstants.GROUP_ID, groupId);
        additionalProperties.put(CodegenConstants.ARTIFACT_ID, artifactId);
        additionalProperties.put(CodegenConstants.ARTIFACT_VERSION, artifactVersion);

        supportingFiles.add(new SupportingFile("index.mustache", "", "index.html"));
        supportingFiles.add(new SupportingFile("js_load_models.mustache", outputFolder + "/assets/js", "loadmodels.js"));
        supportingFiles.add(new SupportingFile("assets/js/jquery.js", outputFolder + "/assets/js", "jquery.js"));
        supportingFiles.add(new SupportingFile("assets/js/bootstrap.js", outputFolder + "/assets/js", "bootstrap.js"));
        supportingFiles.add(new SupportingFile("assets/js/json_schema_ref_parser.js", outputFolder + "/assets/js", "json_schema_ref_parser.js"));
        supportingFiles.add(new SupportingFile("assets/js/json_stringify_safe.js", outputFolder + "/assets/js", "json_stringify_safe.js"));
        supportingFiles.add(new SupportingFile("assets/js/jsonformatter.js", outputFolder + "/assets/js", "jsonformatter.js"));
        supportingFiles.add(new SupportingFile("assets/js/jsonschemaview.js", outputFolder + "/assets/js", "jsonschemaviews.js"));
        supportingFiles.add(new SupportingFile("assets/js/prettify.js", outputFolder + "/assets/js", "prettify.js"));
        supportingFiles.add(new SupportingFile("assets/js/webfontloader.js", outputFolder + "/assets/js", "webfontloader.js"));
        supportingFiles.add(new SupportingFile("assets/js/marked.js", outputFolder + "/assets/js", "marked.js"));
        supportingFiles.add(new SupportingFile("assets/js/functions.js", outputFolder + "/assets/js", "functions.js"));
        supportingFiles.add(new SupportingFile("assets/css/bootstrap.css", outputFolder + "/assets/css", "bootstrap.css"));
        supportingFiles.add(new SupportingFile("assets/css/schema.css", outputFolder + "/assets/css", "schema.css"));
        supportingFiles.add(new SupportingFile("assets/css/bootstrap-tabs.css", outputFolder + "/assets/css", "bootstrap-tabs.css"));
        supportingFiles.add(new SupportingFile("assets/css/prettify.css", outputFolder + "/assets/css", "prettify.css"));
        supportingFiles.add(new SupportingFile("styles.mustache", outputFolder + "/assets/css", "styles.css"));

        reservedWords = new HashSet<String>();

        languageSpecificPrimitives = new HashSet<String>();
        importMapping = new HashMap<String, String>();
    }


    @Override
    public String getDefaultTemplateDir() {
        return "htmlDocsNHS";
    }


    @Override
    public String getName() {
        return "htmlnhs";
    }


    @Override
    public String getHelp() {
        return "Generates a static HTML and resource files for NHS Digital website.";
    }



}
