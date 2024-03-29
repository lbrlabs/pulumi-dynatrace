// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.dynatrace.MobileAppEnablementArgs;
import com.pulumi.dynatrace.Utilities;
import com.pulumi.dynatrace.inputs.MobileAppEnablementState;
import com.pulumi.dynatrace.outputs.MobileAppEnablementRum;
import com.pulumi.dynatrace.outputs.MobileAppEnablementSessionReplay;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="dynatrace:index/mobileAppEnablement:MobileAppEnablement")
public class MobileAppEnablement extends com.pulumi.resources.CustomResource {
    /**
     * The scope of this settings. If the settings should cover the whole environment, just don&#39;t specify any scope.
     * 
     */
    @Export(name="applicationId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> applicationId;

    /**
     * @return The scope of this settings. If the settings should cover the whole environment, just don&#39;t specify any scope.
     * 
     */
    public Output<Optional<String>> applicationId() {
        return Codegen.optional(this.applicationId);
    }
    /**
     * (Field has overlap with `dynatrace.MobileApplication`) Capture and analyze all user actions within your application. Enable [Real User Monitoring (RUM)](https://dt-url.net/1n2b0prq) to monitor and improve your application&#39;s performance, identify errors, and gain insight into your user&#39;s behavior and experience.
     * 
     */
    @Export(name="rum", refs={MobileAppEnablementRum.class}, tree="[0]")
    private Output<MobileAppEnablementRum> rum;

    /**
     * @return (Field has overlap with `dynatrace.MobileApplication`) Capture and analyze all user actions within your application. Enable [Real User Monitoring (RUM)](https://dt-url.net/1n2b0prq) to monitor and improve your application&#39;s performance, identify errors, and gain insight into your user&#39;s behavior and experience.
     * 
     */
    public Output<MobileAppEnablementRum> rum() {
        return this.rum;
    }
    /**
     * (Field has overlap with `dynatrace.MobileApplication`) [Session Replay on crashes](https://dt-url.net/session-replay) gives you additional context for crash analysis in the form of video-like screen recordings that replay user actions immediately preceding a detected crash, while providing [best-in-class security and data protection](https://dt-url.net/b303zxj).
     * 
     */
    @Export(name="sessionReplay", refs={MobileAppEnablementSessionReplay.class}, tree="[0]")
    private Output<MobileAppEnablementSessionReplay> sessionReplay;

    /**
     * @return (Field has overlap with `dynatrace.MobileApplication`) [Session Replay on crashes](https://dt-url.net/session-replay) gives you additional context for crash analysis in the form of video-like screen recordings that replay user actions immediately preceding a detected crash, while providing [best-in-class security and data protection](https://dt-url.net/b303zxj).
     * 
     */
    public Output<MobileAppEnablementSessionReplay> sessionReplay() {
        return this.sessionReplay;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MobileAppEnablement(String name) {
        this(name, MobileAppEnablementArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MobileAppEnablement(String name, MobileAppEnablementArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MobileAppEnablement(String name, MobileAppEnablementArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/mobileAppEnablement:MobileAppEnablement", name, args == null ? MobileAppEnablementArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MobileAppEnablement(String name, Output<String> id, @Nullable MobileAppEnablementState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/mobileAppEnablement:MobileAppEnablement", name, state, makeResourceOptions(options, id));
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
    public static MobileAppEnablement get(String name, Output<String> id, @Nullable MobileAppEnablementState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MobileAppEnablement(name, id, state, options);
    }
}
