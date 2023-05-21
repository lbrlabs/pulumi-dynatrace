// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.dynatrace.Utilities;
import com.pulumi.dynatrace.WebAppEnablementArgs;
import com.pulumi.dynatrace.inputs.WebAppEnablementState;
import com.pulumi.dynatrace.outputs.WebAppEnablementRum;
import com.pulumi.dynatrace.outputs.WebAppEnablementSessionReplay;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="dynatrace:index/webAppEnablement:WebAppEnablement")
public class WebAppEnablement extends com.pulumi.resources.CustomResource {
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
     * Capture and analyze all user actions within your application. Enable [Real User Monitoring (RUM)](https://dt-url.net/1n2b0prq) to monitor and improve your application&#39;s performance, identify errors, and gain insight into your user&#39;s behavior and experience.
     * 
     */
    @Export(name="rum", refs={WebAppEnablementRum.class}, tree="[0]")
    private Output<WebAppEnablementRum> rum;

    /**
     * @return Capture and analyze all user actions within your application. Enable [Real User Monitoring (RUM)](https://dt-url.net/1n2b0prq) to monitor and improve your application&#39;s performance, identify errors, and gain insight into your user&#39;s behavior and experience.
     * 
     */
    public Output<WebAppEnablementRum> rum() {
        return this.rum;
    }
    /**
     * [Session Replay](https://dt-url.net/session-replay) captures all user interactions within your application and replays them in a movie-like experience while providing [best-in-class security and data protection](https://dt-url.net/b303zxj).
     * 
     */
    @Export(name="sessionReplay", refs={WebAppEnablementSessionReplay.class}, tree="[0]")
    private Output<WebAppEnablementSessionReplay> sessionReplay;

    /**
     * @return [Session Replay](https://dt-url.net/session-replay) captures all user interactions within your application and replays them in a movie-like experience while providing [best-in-class security and data protection](https://dt-url.net/b303zxj).
     * 
     */
    public Output<WebAppEnablementSessionReplay> sessionReplay() {
        return this.sessionReplay;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WebAppEnablement(String name) {
        this(name, WebAppEnablementArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WebAppEnablement(String name, WebAppEnablementArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WebAppEnablement(String name, WebAppEnablementArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/webAppEnablement:WebAppEnablement", name, args == null ? WebAppEnablementArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WebAppEnablement(String name, Output<String> id, @Nullable WebAppEnablementState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/webAppEnablement:WebAppEnablement", name, state, makeResourceOptions(options, id));
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
    public static WebAppEnablement get(String name, Output<String> id, @Nullable WebAppEnablementState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WebAppEnablement(name, id, state, options);
    }
}