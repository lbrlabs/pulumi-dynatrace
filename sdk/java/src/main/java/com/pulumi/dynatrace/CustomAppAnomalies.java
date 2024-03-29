// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.dynatrace.CustomAppAnomaliesArgs;
import com.pulumi.dynatrace.Utilities;
import com.pulumi.dynatrace.inputs.CustomAppAnomaliesState;
import com.pulumi.dynatrace.outputs.CustomAppAnomaliesErrorRateIncrease;
import com.pulumi.dynatrace.outputs.CustomAppAnomaliesSlowUserActions;
import com.pulumi.dynatrace.outputs.CustomAppAnomaliesUnexpectedHighLoad;
import com.pulumi.dynatrace.outputs.CustomAppAnomaliesUnexpectedLowLoad;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="dynatrace:index/customAppAnomalies:CustomAppAnomalies")
public class CustomAppAnomalies extends com.pulumi.resources.CustomResource {
    /**
     * Error rate increase
     * 
     */
    @Export(name="errorRateIncrease", refs={CustomAppAnomaliesErrorRateIncrease.class}, tree="[0]")
    private Output<CustomAppAnomaliesErrorRateIncrease> errorRateIncrease;

    /**
     * @return Error rate increase
     * 
     */
    public Output<CustomAppAnomaliesErrorRateIncrease> errorRateIncrease() {
        return this.errorRateIncrease;
    }
    /**
     * The scope of this setting (DEVICE*APPLICATION*METHOD CUSTOM_APPLICATION environment)
     * 
     */
    @Export(name="scope", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> scope;

    /**
     * @return The scope of this setting (DEVICE*APPLICATION*METHOD CUSTOM_APPLICATION environment)
     * 
     */
    public Output<Optional<String>> scope() {
        return Codegen.optional(this.scope);
    }
    /**
     * Slow user actions
     * 
     */
    @Export(name="slowUserActions", refs={CustomAppAnomaliesSlowUserActions.class}, tree="[0]")
    private Output<CustomAppAnomaliesSlowUserActions> slowUserActions;

    /**
     * @return Slow user actions
     * 
     */
    public Output<CustomAppAnomaliesSlowUserActions> slowUserActions() {
        return this.slowUserActions;
    }
    /**
     * Unexpected high load
     * 
     */
    @Export(name="unexpectedHighLoad", refs={CustomAppAnomaliesUnexpectedHighLoad.class}, tree="[0]")
    private Output<CustomAppAnomaliesUnexpectedHighLoad> unexpectedHighLoad;

    /**
     * @return Unexpected high load
     * 
     */
    public Output<CustomAppAnomaliesUnexpectedHighLoad> unexpectedHighLoad() {
        return this.unexpectedHighLoad;
    }
    /**
     * Unexpected low load
     * 
     */
    @Export(name="unexpectedLowLoad", refs={CustomAppAnomaliesUnexpectedLowLoad.class}, tree="[0]")
    private Output<CustomAppAnomaliesUnexpectedLowLoad> unexpectedLowLoad;

    /**
     * @return Unexpected low load
     * 
     */
    public Output<CustomAppAnomaliesUnexpectedLowLoad> unexpectedLowLoad() {
        return this.unexpectedLowLoad;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CustomAppAnomalies(String name) {
        this(name, CustomAppAnomaliesArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CustomAppAnomalies(String name, CustomAppAnomaliesArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CustomAppAnomalies(String name, CustomAppAnomaliesArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/customAppAnomalies:CustomAppAnomalies", name, args == null ? CustomAppAnomaliesArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CustomAppAnomalies(String name, Output<String> id, @Nullable CustomAppAnomaliesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/customAppAnomalies:CustomAppAnomalies", name, state, makeResourceOptions(options, id));
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
    public static CustomAppAnomalies get(String name, Output<String> id, @Nullable CustomAppAnomaliesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CustomAppAnomalies(name, id, state, options);
    }
}
