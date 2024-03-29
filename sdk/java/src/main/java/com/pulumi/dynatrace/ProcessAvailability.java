// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.dynatrace.ProcessAvailabilityArgs;
import com.pulumi.dynatrace.Utilities;
import com.pulumi.dynatrace.inputs.ProcessAvailabilityState;
import com.pulumi.dynatrace.outputs.ProcessAvailabilityMetadata;
import com.pulumi.dynatrace.outputs.ProcessAvailabilityRules;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="dynatrace:index/processAvailability:ProcessAvailability")
public class ProcessAvailability extends com.pulumi.resources.CustomResource {
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
     * Set of additional key-value properties to be attached to the triggered event.
     * 
     */
    @Export(name="metadata", refs={ProcessAvailabilityMetadata.class}, tree="[0]")
    private Output</* @Nullable */ ProcessAvailabilityMetadata> metadata;

    /**
     * @return Set of additional key-value properties to be attached to the triggered event.
     * 
     */
    public Output<Optional<ProcessAvailabilityMetadata>> metadata() {
        return Codegen.optional(this.metadata);
    }
    /**
     * Monitored rule name
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Monitored rule name
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Define process detection rules by selecting a process property and a condition. Each monitoring rule can have multiple
     * detection rules associated with it.
     * 
     */
    @Export(name="rules", refs={ProcessAvailabilityRules.class}, tree="[0]")
    private Output</* @Nullable */ ProcessAvailabilityRules> rules;

    /**
     * @return Define process detection rules by selecting a process property and a condition. Each monitoring rule can have multiple
     * detection rules associated with it.
     * 
     */
    public Output<Optional<ProcessAvailabilityRules>> rules() {
        return Codegen.optional(this.rules);
    }
    /**
     * The scope of this setting (HOST, HOST_GROUP). Omit this property if you want to cover the whole environment.
     * 
     */
    @Export(name="scope", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> scope;

    /**
     * @return The scope of this setting (HOST, HOST_GROUP). Omit this property if you want to cover the whole environment.
     * 
     */
    public Output<Optional<String>> scope() {
        return Codegen.optional(this.scope);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ProcessAvailability(String name) {
        this(name, ProcessAvailabilityArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ProcessAvailability(String name, ProcessAvailabilityArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ProcessAvailability(String name, ProcessAvailabilityArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/processAvailability:ProcessAvailability", name, args == null ? ProcessAvailabilityArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ProcessAvailability(String name, Output<String> id, @Nullable ProcessAvailabilityState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/processAvailability:ProcessAvailability", name, state, makeResourceOptions(options, id));
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
    public static ProcessAvailability get(String name, Output<String> id, @Nullable ProcessAvailabilityState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ProcessAvailability(name, id, state, options);
    }
}
