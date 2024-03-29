// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.dynatrace.ProviderArgs;
import com.pulumi.dynatrace.Utilities;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The provider type for the dynatrace package. By default, resources use package-wide configuration
 * settings, however an explicit `Provider` instance may be created and passed during resource
 * construction to achieve fine-grained programmatic control over provider settings. See the
 * [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
 * 
 */
@ResourceType(type="pulumi:providers:dynatrace")
public class Provider extends com.pulumi.resources.ProviderResource {
    @Export(name="dtApiToken", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> dtApiToken;

    public Output<Optional<String>> dtApiToken() {
        return Codegen.optional(this.dtApiToken);
    }
    @Export(name="dtClusterApiToken", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> dtClusterApiToken;

    public Output<Optional<String>> dtClusterApiToken() {
        return Codegen.optional(this.dtClusterApiToken);
    }
    @Export(name="dtClusterUrl", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> dtClusterUrl;

    public Output<Optional<String>> dtClusterUrl() {
        return Codegen.optional(this.dtClusterUrl);
    }
    @Export(name="dtEnvUrl", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> dtEnvUrl;

    public Output<Optional<String>> dtEnvUrl() {
        return Codegen.optional(this.dtEnvUrl);
    }
    @Export(name="iamAccountId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> iamAccountId;

    public Output<Optional<String>> iamAccountId() {
        return Codegen.optional(this.iamAccountId);
    }
    @Export(name="iamClientId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> iamClientId;

    public Output<Optional<String>> iamClientId() {
        return Codegen.optional(this.iamClientId);
    }
    @Export(name="iamClientSecret", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> iamClientSecret;

    public Output<Optional<String>> iamClientSecret() {
        return Codegen.optional(this.iamClientSecret);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Provider(String name) {
        this(name, ProviderArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Provider(String name, @Nullable ProviderArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Provider(String name, @Nullable ProviderArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace", name, args == null ? ProviderArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "dtApiToken",
                "dtClusterApiToken",
                "dtClusterUrl",
                "iamAccountId",
                "iamClientId",
                "iamClientSecret"
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

}
