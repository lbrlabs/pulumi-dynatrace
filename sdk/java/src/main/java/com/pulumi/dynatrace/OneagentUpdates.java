// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.dynatrace.OneagentUpdatesArgs;
import com.pulumi.dynatrace.Utilities;
import com.pulumi.dynatrace.inputs.OneagentUpdatesState;
import com.pulumi.dynatrace.outputs.OneagentUpdatesMaintenanceWindows;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="dynatrace:index/oneagentUpdates:OneagentUpdates")
public class OneagentUpdates extends com.pulumi.resources.CustomResource {
    /**
     * Maintenance windows
     * 
     */
    @Export(name="maintenanceWindows", refs={OneagentUpdatesMaintenanceWindows.class}, tree="[0]")
    private Output</* @Nullable */ OneagentUpdatesMaintenanceWindows> maintenanceWindows;

    /**
     * @return Maintenance windows
     * 
     */
    public Output<Optional<OneagentUpdatesMaintenanceWindows>> maintenanceWindows() {
        return Codegen.optional(this.maintenanceWindows);
    }
    /**
     * Revision
     * 
     */
    @Export(name="revision", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> revision;

    /**
     * @return Revision
     * 
     */
    public Output<Optional<String>> revision() {
        return Codegen.optional(this.revision);
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
     * Target version
     * 
     */
    @Export(name="targetVersion", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> targetVersion;

    /**
     * @return Target version
     * 
     */
    public Output<Optional<String>> targetVersion() {
        return Codegen.optional(this.targetVersion);
    }
    /**
     * Possible Values: `AUTOMATIC`, `AUTOMATIC_DURING_MW`, `MANUAL`
     * 
     */
    @Export(name="updateMode", refs={String.class}, tree="[0]")
    private Output<String> updateMode;

    /**
     * @return Possible Values: `AUTOMATIC`, `AUTOMATIC_DURING_MW`, `MANUAL`
     * 
     */
    public Output<String> updateMode() {
        return this.updateMode;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OneagentUpdates(String name) {
        this(name, OneagentUpdatesArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OneagentUpdates(String name, OneagentUpdatesArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OneagentUpdates(String name, OneagentUpdatesArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/oneagentUpdates:OneagentUpdates", name, args == null ? OneagentUpdatesArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private OneagentUpdates(String name, Output<String> id, @Nullable OneagentUpdatesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/oneagentUpdates:OneagentUpdates", name, state, makeResourceOptions(options, id));
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
    public static OneagentUpdates get(String name, Output<String> id, @Nullable OneagentUpdatesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OneagentUpdates(name, id, state, options);
    }
}
