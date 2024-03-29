// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.dynatrace.BusinessEventsProcessingArgs;
import com.pulumi.dynatrace.Utilities;
import com.pulumi.dynatrace.inputs.BusinessEventsProcessingState;
import com.pulumi.dynatrace.outputs.BusinessEventsProcessingRuleTesting;
import com.pulumi.dynatrace.outputs.BusinessEventsProcessingTransformationFields;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="dynatrace:index/businessEventsProcessing:BusinessEventsProcessing")
public class BusinessEventsProcessing extends com.pulumi.resources.CustomResource {
    /**
     * This setting is enabled (`true`) or disabled (`false`)
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> enabled;

    /**
     * @return This setting is enabled (`true`) or disabled (`false`)
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }
    /**
     * [See our documentation](https://dt-url.net/bp234rv)
     * 
     */
    @Export(name="matcher", refs={String.class}, tree="[0]")
    private Output<String> matcher;

    /**
     * @return [See our documentation](https://dt-url.net/bp234rv)
     * 
     */
    public Output<String> matcher() {
        return this.matcher;
    }
    /**
     * Rule name
     * 
     */
    @Export(name="ruleName", refs={String.class}, tree="[0]")
    private Output<String> ruleName;

    /**
     * @return Rule name
     * 
     */
    public Output<String> ruleName() {
        return this.ruleName;
    }
    /**
     * ## Rule testing ### 1. Paste an event sample
     * 
     */
    @Export(name="ruleTesting", refs={BusinessEventsProcessingRuleTesting.class}, tree="[0]")
    private Output<BusinessEventsProcessingRuleTesting> ruleTesting;

    /**
     * @return ## Rule testing ### 1. Paste an event sample
     * 
     */
    public Output<BusinessEventsProcessingRuleTesting> ruleTesting() {
        return this.ruleTesting;
    }
    /**
     * [See our documentation](https://dt-url.net/pz030w5)
     * 
     */
    @Export(name="script", refs={String.class}, tree="[0]")
    private Output<String> script;

    /**
     * @return [See our documentation](https://dt-url.net/pz030w5)
     * 
     */
    public Output<String> script() {
        return this.script;
    }
    /**
     * Transformation fields
     * 
     */
    @Export(name="transformationFields", refs={BusinessEventsProcessingTransformationFields.class}, tree="[0]")
    private Output</* @Nullable */ BusinessEventsProcessingTransformationFields> transformationFields;

    /**
     * @return Transformation fields
     * 
     */
    public Output<Optional<BusinessEventsProcessingTransformationFields>> transformationFields() {
        return Codegen.optional(this.transformationFields);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BusinessEventsProcessing(String name) {
        this(name, BusinessEventsProcessingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BusinessEventsProcessing(String name, BusinessEventsProcessingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BusinessEventsProcessing(String name, BusinessEventsProcessingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/businessEventsProcessing:BusinessEventsProcessing", name, args == null ? BusinessEventsProcessingArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BusinessEventsProcessing(String name, Output<String> id, @Nullable BusinessEventsProcessingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/businessEventsProcessing:BusinessEventsProcessing", name, state, makeResourceOptions(options, id));
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
    public static BusinessEventsProcessing get(String name, Output<String> id, @Nullable BusinessEventsProcessingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BusinessEventsProcessing(name, id, state, options);
    }
}
