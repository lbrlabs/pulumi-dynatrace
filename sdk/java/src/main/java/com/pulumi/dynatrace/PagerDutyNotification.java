// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.dynatrace.PagerDutyNotificationArgs;
import com.pulumi.dynatrace.Utilities;
import com.pulumi.dynatrace.inputs.PagerDutyNotificationState;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="dynatrace:index/pagerDutyNotification:PagerDutyNotification")
public class PagerDutyNotification extends com.pulumi.resources.CustomResource {
    /**
     * The name of the PagerDuty account
     * 
     */
    @Export(name="account", refs={String.class}, tree="[0]")
    private Output<String> account;

    /**
     * @return The name of the PagerDuty account
     * 
     */
    public Output<String> account() {
        return this.account;
    }
    /**
     * The configuration is enabled (`true`) or disabled (`false`)
     * 
     */
    @Export(name="active", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> active;

    /**
     * @return The configuration is enabled (`true`) or disabled (`false`)
     * 
     */
    public Output<Boolean> active() {
        return this.active;
    }
    /**
     * The API key to access PagerDuty
     * 
     */
    @Export(name="apiKey", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> apiKey;

    /**
     * @return The API key to access PagerDuty
     * 
     */
    public Output<Optional<String>> apiKey() {
        return Codegen.optional(this.apiKey);
    }
    /**
     * The ID of these settings when referred to from resources requiring the REST API V1 keys
     * 
     */
    @Export(name="legacyId", refs={String.class}, tree="[0]")
    private Output<String> legacyId;

    /**
     * @return The ID of these settings when referred to from resources requiring the REST API V1 keys
     * 
     */
    public Output<String> legacyId() {
        return this.legacyId;
    }
    /**
     * The name of the notification configuration
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the notification configuration
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the associated alerting profile
     * 
     */
    @Export(name="profile", refs={String.class}, tree="[0]")
    private Output<String> profile;

    /**
     * @return The ID of the associated alerting profile
     * 
     */
    public Output<String> profile() {
        return this.profile;
    }
    /**
     * The name of the PagerDuty Service
     * 
     */
    @Export(name="service", refs={String.class}, tree="[0]")
    private Output<String> service;

    /**
     * @return The name of the PagerDuty Service
     * 
     */
    public Output<String> service() {
        return this.service;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PagerDutyNotification(String name) {
        this(name, PagerDutyNotificationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PagerDutyNotification(String name, PagerDutyNotificationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PagerDutyNotification(String name, PagerDutyNotificationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/pagerDutyNotification:PagerDutyNotification", name, args == null ? PagerDutyNotificationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PagerDutyNotification(String name, Output<String> id, @Nullable PagerDutyNotificationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/pagerDutyNotification:PagerDutyNotification", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "apiKey"
            ))
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
    public static PagerDutyNotification get(String name, Output<String> id, @Nullable PagerDutyNotificationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PagerDutyNotification(name, id, state, options);
    }
}
