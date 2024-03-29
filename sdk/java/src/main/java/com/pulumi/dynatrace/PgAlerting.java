// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.dynatrace.PgAlertingArgs;
import com.pulumi.dynatrace.Utilities;
import com.pulumi.dynatrace.inputs.PgAlertingState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="dynatrace:index/pgAlerting:PgAlerting")
public class PgAlerting extends com.pulumi.resources.CustomResource {
    /**
     * **if any process becomes unavailable:**
     * Dynatrace will open a new problem if a single process in this group shuts down or crashes.
     * 
     */
    @Export(name="alertingMode", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> alertingMode;

    /**
     * @return **if any process becomes unavailable:**
     * Dynatrace will open a new problem if a single process in this group shuts down or crashes.
     * 
     */
    public Output<Optional<String>> alertingMode() {
        return Codegen.optional(this.alertingMode);
    }
    /**
     * Enable process group availability monitoring
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> enabled;

    /**
     * @return Enable process group availability monitoring
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }
    /**
     * Open a new problem if the number of active process instances in the group is fewer than:
     * 
     */
    @Export(name="minimumInstanceThreshold", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> minimumInstanceThreshold;

    /**
     * @return Open a new problem if the number of active process instances in the group is fewer than:
     * 
     */
    public Output<Optional<Integer>> minimumInstanceThreshold() {
        return Codegen.optional(this.minimumInstanceThreshold);
    }
    /**
     * The process group ID for availability monitoring
     * 
     */
    @Export(name="processGroup", refs={String.class}, tree="[0]")
    private Output<String> processGroup;

    /**
     * @return The process group ID for availability monitoring
     * 
     */
    public Output<String> processGroup() {
        return this.processGroup;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PgAlerting(String name) {
        this(name, PgAlertingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PgAlerting(String name, PgAlertingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PgAlerting(String name, PgAlertingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/pgAlerting:PgAlerting", name, args == null ? PgAlertingArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PgAlerting(String name, Output<String> id, @Nullable PgAlertingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/pgAlerting:PgAlerting", name, state, makeResourceOptions(options, id));
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
    public static PgAlerting get(String name, Output<String> id, @Nullable PgAlertingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PgAlerting(name, id, state, options);
    }
}
