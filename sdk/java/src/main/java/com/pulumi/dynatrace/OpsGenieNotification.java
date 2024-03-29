// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.dynatrace.OpsGenieNotificationArgs;
import com.pulumi.dynatrace.Utilities;
import com.pulumi.dynatrace.inputs.OpsGenieNotificationState;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="dynatrace:index/opsGenieNotification:OpsGenieNotification")
public class OpsGenieNotification extends com.pulumi.resources.CustomResource {
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
     * The API key to access OpsGenie
     * 
     */
    @Export(name="apiKey", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> apiKey;

    /**
     * @return The API key to access OpsGenie
     * 
     */
    public Output<Optional<String>> apiKey() {
        return Codegen.optional(this.apiKey);
    }
    /**
     * The region domain of the OpsGenie
     * 
     */
    @Export(name="domain", refs={String.class}, tree="[0]")
    private Output<String> domain;

    /**
     * @return The region domain of the OpsGenie
     * 
     */
    public Output<String> domain() {
        return this.domain;
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
     * The content of the message.  You can use the following placeholders:  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem
     * 
     */
    @Export(name="message", refs={String.class}, tree="[0]")
    private Output<String> message;

    /**
     * @return The content of the message.  You can use the following placeholders:  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem
     * 
     */
    public Output<String> message() {
        return this.message;
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OpsGenieNotification(String name) {
        this(name, OpsGenieNotificationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OpsGenieNotification(String name, OpsGenieNotificationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OpsGenieNotification(String name, OpsGenieNotificationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/opsGenieNotification:OpsGenieNotification", name, args == null ? OpsGenieNotificationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private OpsGenieNotification(String name, Output<String> id, @Nullable OpsGenieNotificationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/opsGenieNotification:OpsGenieNotification", name, state, makeResourceOptions(options, id));
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
    public static OpsGenieNotification get(String name, Output<String> id, @Nullable OpsGenieNotificationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OpsGenieNotification(name, id, state, options);
    }
}
