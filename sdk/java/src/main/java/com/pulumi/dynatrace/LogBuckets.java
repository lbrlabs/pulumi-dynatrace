// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.dynatrace.LogBucketsArgs;
import com.pulumi.dynatrace.Utilities;
import com.pulumi.dynatrace.inputs.LogBucketsState;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="dynatrace:index/logBuckets:LogBuckets")
public class LogBuckets extends com.pulumi.resources.CustomResource {
    /**
     * A &#39;bucket&#39; is the length of time your logs will be stored. Select the bucket that&#39;s best for you.
     * 
     */
    @Export(name="bucketName", refs={String.class}, tree="[0]")
    private Output<String> bucketName;

    /**
     * @return A &#39;bucket&#39; is the length of time your logs will be stored. Select the bucket that&#39;s best for you.
     * 
     */
    public Output<String> bucketName() {
        return this.bucketName;
    }
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
     * Matcher (DQL)
     * 
     */
    @Export(name="matcher", refs={String.class}, tree="[0]")
    private Output<String> matcher;

    /**
     * @return Matcher (DQL)
     * 
     */
    public Output<String> matcher() {
        return this.matcher;
    }
    /**
     * Rule name
     * 
     */
    @Export(name="ruleName", refs={String.class}, tree="[0]")
    private Output<String> ruleName;

    /**
     * @return Rule name
     * 
     */
    public Output<String> ruleName() {
        return this.ruleName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LogBuckets(String name) {
        this(name, LogBucketsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LogBuckets(String name, LogBucketsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LogBuckets(String name, LogBucketsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/logBuckets:LogBuckets", name, args == null ? LogBucketsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LogBuckets(String name, Output<String> id, @Nullable LogBucketsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/logBuckets:LogBuckets", name, state, makeResourceOptions(options, id));
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
    public static LogBuckets get(String name, Output<String> id, @Nullable LogBucketsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LogBuckets(name, id, state, options);
    }
}
