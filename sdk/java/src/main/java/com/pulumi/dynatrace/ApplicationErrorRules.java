// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.dynatrace.ApplicationErrorRulesArgs;
import com.pulumi.dynatrace.Utilities;
import com.pulumi.dynatrace.inputs.ApplicationErrorRulesState;
import com.pulumi.dynatrace.outputs.ApplicationErrorRulesCustomErrors;
import com.pulumi.dynatrace.outputs.ApplicationErrorRulesHttpErrors;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="dynatrace:index/applicationErrorRules:ApplicationErrorRules")
public class ApplicationErrorRules extends com.pulumi.resources.CustomResource {
    /**
     * An ordered list of HTTP errors.
     * 
     */
    @Export(name="customErrors", type=ApplicationErrorRulesCustomErrors.class, parameters={})
    private Output</* @Nullable */ ApplicationErrorRulesCustomErrors> customErrors;

    /**
     * @return An ordered list of HTTP errors.
     * 
     */
    public Output<Optional<ApplicationErrorRulesCustomErrors>> customErrors() {
        return Codegen.optional(this.customErrors);
    }
    /**
     * An ordered list of HTTP errors. Rules are evaluated from top to bottom; the first matching rule applies
     * 
     */
    @Export(name="httpErrors", type=ApplicationErrorRulesHttpErrors.class, parameters={})
    private Output</* @Nullable */ ApplicationErrorRulesHttpErrors> httpErrors;

    /**
     * @return An ordered list of HTTP errors. Rules are evaluated from top to bottom; the first matching rule applies
     * 
     */
    public Output<Optional<ApplicationErrorRulesHttpErrors>> httpErrors() {
        return Codegen.optional(this.httpErrors);
    }
    /**
     * Exclude (`true`) or include (`false`) custom errors listed in **customErrorRules** in Apdex calculation
     * 
     */
    @Export(name="ignoreCustomErrorsApdex", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> ignoreCustomErrorsApdex;

    /**
     * @return Exclude (`true`) or include (`false`) custom errors listed in **customErrorRules** in Apdex calculation
     * 
     */
    public Output<Optional<Boolean>> ignoreCustomErrorsApdex() {
        return Codegen.optional(this.ignoreCustomErrorsApdex);
    }
    /**
     * Exclude (`true`) or include (`false`) HTTP errors listed in **httpErrorRules** in Apdex calculation
     * 
     */
    @Export(name="ignoreHttpErrorsApdex", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> ignoreHttpErrorsApdex;

    /**
     * @return Exclude (`true`) or include (`false`) HTTP errors listed in **httpErrorRules** in Apdex calculation
     * 
     */
    public Output<Optional<Boolean>> ignoreHttpErrorsApdex() {
        return Codegen.optional(this.ignoreHttpErrorsApdex);
    }
    /**
     * Exclude (`true`) or include (`false`) JavaScript errors in Apdex calculation
     * 
     */
    @Export(name="ignoreJsErrorsApdex", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> ignoreJsErrorsApdex;

    /**
     * @return Exclude (`true`) or include (`false`) JavaScript errors in Apdex calculation
     * 
     */
    public Output<Optional<Boolean>> ignoreJsErrorsApdex() {
        return Codegen.optional(this.ignoreJsErrorsApdex);
    }
    /**
     * The EntityID of the the WebApplication
     * 
     */
    @Export(name="webApplicationId", type=String.class, parameters={})
    private Output</* @Nullable */ String> webApplicationId;

    /**
     * @return The EntityID of the the WebApplication
     * 
     */
    public Output<Optional<String>> webApplicationId() {
        return Codegen.optional(this.webApplicationId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ApplicationErrorRules(String name) {
        this(name, ApplicationErrorRulesArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApplicationErrorRules(String name, @Nullable ApplicationErrorRulesArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApplicationErrorRules(String name, @Nullable ApplicationErrorRulesArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/applicationErrorRules:ApplicationErrorRules", name, args == null ? ApplicationErrorRulesArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ApplicationErrorRules(String name, Output<String> id, @Nullable ApplicationErrorRulesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/applicationErrorRules:ApplicationErrorRules", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ApplicationErrorRules get(String name, Output<String> id, @Nullable ApplicationErrorRulesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ApplicationErrorRules(name, id, state, options);
    }
}
