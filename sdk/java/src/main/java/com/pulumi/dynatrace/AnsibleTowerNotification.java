// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.dynatrace.AnsibleTowerNotificationArgs;
import com.pulumi.dynatrace.Utilities;
import com.pulumi.dynatrace.inputs.AnsibleTowerNotificationState;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="dynatrace:index/ansibleTowerNotification:AnsibleTowerNotification")
public class AnsibleTowerNotification extends com.pulumi.resources.CustomResource {
    /**
     * The notification is active (`true`) or inactive (`false`). Default is `false`.
     * 
     */
    @Export(name="active", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> active;

    /**
     * @return The notification is active (`true`) or inactive (`false`). Default is `false`.
     * 
     */
    public Output<Optional<Boolean>> active() {
        return Codegen.optional(this.active);
    }
    /**
     * The custom message of the notification. This message will be displayed in the extra variables **Message** field of your job template. You can use the following placeholders:  * `{ImpactedEntities}`: Details about the entities impacted by the problem in form of a JSON array.  * `{ImpactedEntity}`: The entity impacted by the problem or *X* impacted entities.  * `{PID}`: The ID of the reported problem.  * `{ProblemDetailsText}`: All problem event details, including root cause, as a text-formatted string.  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem.  * `{ProblemURL}`: The URL of the problem within Dynatrace.  * `{State}`: The state of the problem. Possible values are `OPEN` and `RESOLVED`.  * `{Tags}`: The list of tags that are defined for all impacted entities, separated by commas
     * 
     */
    @Export(name="customMessage", refs={String.class}, tree="[0]")
    private Output<String> customMessage;

    /**
     * @return The custom message of the notification. This message will be displayed in the extra variables **Message** field of your job template. You can use the following placeholders:  * `{ImpactedEntities}`: Details about the entities impacted by the problem in form of a JSON array.  * `{ImpactedEntity}`: The entity impacted by the problem or *X* impacted entities.  * `{PID}`: The ID of the reported problem.  * `{ProblemDetailsText}`: All problem event details, including root cause, as a text-formatted string.  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem.  * `{ProblemURL}`: The URL of the problem within Dynatrace.  * `{State}`: The state of the problem. Possible values are `OPEN` and `RESOLVED`.  * `{Tags}`: The list of tags that are defined for all impacted entities, separated by commas
     * 
     */
    public Output<String> customMessage() {
        return this.customMessage;
    }
    /**
     * Accept any, including self-signed and invalid, SSL certificate (`true`) or only trusted (`false`) certificates. Default is `false`.
     * 
     */
    @Export(name="insecure", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> insecure;

    /**
     * @return Accept any, including self-signed and invalid, SSL certificate (`true`) or only trusted (`false`) certificates. Default is `false`.
     * 
     */
    public Output<Optional<Boolean>> insecure() {
        return Codegen.optional(this.insecure);
    }
    /**
     * The URL of the target Ansible Tower job template
     * 
     */
    @Export(name="jobTemplateUrl", refs={String.class}, tree="[0]")
    private Output<String> jobTemplateUrl;

    /**
     * @return The URL of the target Ansible Tower job template
     * 
     */
    public Output<String> jobTemplateUrl() {
        return this.jobTemplateUrl;
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
     * The display name within the Dynatrace WebUI.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The display name within the Dynatrace WebUI.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The password for the Ansible Tower account
     * 
     */
    @Export(name="password", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> password;

    /**
     * @return The password for the Ansible Tower account
     * 
     */
    public Output<Optional<String>> password() {
        return Codegen.optional(this.password);
    }
    /**
     * The ID of the associated alerting profile.
     * 
     */
    @Export(name="profile", refs={String.class}, tree="[0]")
    private Output<String> profile;

    /**
     * @return The ID of the associated alerting profile.
     * 
     */
    public Output<String> profile() {
        return this.profile;
    }
    /**
     * The username of the Ansible Tower account
     * 
     */
    @Export(name="username", refs={String.class}, tree="[0]")
    private Output<String> username;

    /**
     * @return The username of the Ansible Tower account
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AnsibleTowerNotification(String name) {
        this(name, AnsibleTowerNotificationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AnsibleTowerNotification(String name, AnsibleTowerNotificationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AnsibleTowerNotification(String name, AnsibleTowerNotificationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/ansibleTowerNotification:AnsibleTowerNotification", name, args == null ? AnsibleTowerNotificationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AnsibleTowerNotification(String name, Output<String> id, @Nullable AnsibleTowerNotificationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/ansibleTowerNotification:AnsibleTowerNotification", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "password"
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
    public static AnsibleTowerNotification get(String name, Output<String> id, @Nullable AnsibleTowerNotificationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AnsibleTowerNotification(name, id, state, options);
    }
}
