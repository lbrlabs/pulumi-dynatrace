// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.dynatrace.DashboardSharingArgs;
import com.pulumi.dynatrace.Utilities;
import com.pulumi.dynatrace.inputs.DashboardSharingState;
import com.pulumi.dynatrace.outputs.DashboardSharingPermissions;
import com.pulumi.dynatrace.outputs.DashboardSharingPublic;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Dynatrace Documentation
 * 
 * - Share Dynatrace dashboards - https://www.dynatrace.com/support/help/how-to-use-dynatrace/dashboards-and-charts/dashboards/share-dashboards
 * 
 * - Dashboards API - https://www.dynatrace.com/support/help/dynatrace-api/configuration-api/dashboards-api
 * 
 */
@ResourceType(type="dynatrace:index/dashboardSharing:DashboardSharing")
public class DashboardSharing extends com.pulumi.resources.CustomResource {
    /**
     * The Dynatrace entity ID of the dashboard
     * 
     */
    @Export(name="dashboardId", refs={String.class}, tree="[0]")
    private Output<String> dashboardId;

    /**
     * @return The Dynatrace entity ID of the dashboard
     * 
     */
    public Output<String> dashboardId() {
        return this.dashboardId;
    }
    /**
     * The dashboard is shared (`true`) or private (`false`)
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return The dashboard is shared (`true`) or private (`false`)
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * Access permissions of the dashboard
     * 
     */
    @Export(name="permissions", refs={DashboardSharingPermissions.class}, tree="[0]")
    private Output</* @Nullable */ DashboardSharingPermissions> permissions;

    /**
     * @return Access permissions of the dashboard
     * 
     */
    public Output<Optional<DashboardSharingPermissions>> permissions() {
        return Codegen.optional(this.permissions);
    }
    /**
     * If `true` the dashboard will be marked as preset
     * 
     */
    @Export(name="preset", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> preset;

    /**
     * @return If `true` the dashboard will be marked as preset
     * 
     */
    public Output<Optional<Boolean>> preset() {
        return Codegen.optional(this.preset);
    }
    /**
     * Configuration of the [anonymous access](https://dt-url.net/ov03sf1) to the dashboard
     * 
     */
    @Export(name="public", refs={DashboardSharingPublic.class}, tree="[0]")
    private Output</* @Nullable */ DashboardSharingPublic> public_;

    /**
     * @return Configuration of the [anonymous access](https://dt-url.net/ov03sf1) to the dashboard
     * 
     */
    public Output<Optional<DashboardSharingPublic>> public_() {
        return Codegen.optional(this.public_);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DashboardSharing(String name) {
        this(name, DashboardSharingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DashboardSharing(String name, DashboardSharingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DashboardSharing(String name, DashboardSharingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/dashboardSharing:DashboardSharing", name, args == null ? DashboardSharingArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DashboardSharing(String name, Output<String> id, @Nullable DashboardSharingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/dashboardSharing:DashboardSharing", name, state, makeResourceOptions(options, id));
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
    public static DashboardSharing get(String name, Output<String> id, @Nullable DashboardSharingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DashboardSharing(name, id, state, options);
    }
}
