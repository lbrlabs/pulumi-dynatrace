// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.dynatrace.PgAnomaliesArgs;
import com.pulumi.dynatrace.Utilities;
import com.pulumi.dynatrace.inputs.PgAnomaliesState;
import com.pulumi.dynatrace.outputs.PgAnomaliesAvailability;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="dynatrace:index/pgAnomalies:PgAnomalies")
public class PgAnomalies extends com.pulumi.resources.CustomResource {
    /**
     * Configuration of the availability monitoring for the process group.
     * 
     */
    @Export(name="availability", refs={PgAnomaliesAvailability.class}, tree="[0]")
    private Output</* @Nullable */ PgAnomaliesAvailability> availability;

    /**
     * @return Configuration of the availability monitoring for the process group.
     * 
     */
    public Output<Optional<PgAnomaliesAvailability>> availability() {
        return Codegen.optional(this.availability);
    }
    /**
     * The ID of the process group
     * 
     */
    @Export(name="pgId", refs={String.class}, tree="[0]")
    private Output<String> pgId;

    /**
     * @return The ID of the process group
     * 
     */
    public Output<String> pgId() {
        return this.pgId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PgAnomalies(String name) {
        this(name, PgAnomaliesArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PgAnomalies(String name, PgAnomaliesArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PgAnomalies(String name, PgAnomaliesArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/pgAnomalies:PgAnomalies", name, args == null ? PgAnomaliesArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PgAnomalies(String name, Output<String> id, @Nullable PgAnomaliesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/pgAnomalies:PgAnomalies", name, state, makeResourceOptions(options, id));
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
    public static PgAnomalies get(String name, Output<String> id, @Nullable PgAnomaliesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PgAnomalies(name, id, state, options);
    }
}
