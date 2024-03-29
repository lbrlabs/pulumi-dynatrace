// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.dynatrace.ApiDetectionArgs;
import com.pulumi.dynatrace.Utilities;
import com.pulumi.dynatrace.inputs.ApiDetectionState;
import com.pulumi.dynatrace.outputs.ApiDetectionConditions;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="dynatrace:index/apiDetection:ApiDetection")
public class ApiDetection extends com.pulumi.resources.CustomResource {
    /**
     * This color will be used to highlight APIs when viewing code level data, such as distributed traces or method hotspots.
     * 
     */
    @Export(name="apiColor", refs={String.class}, tree="[0]")
    private Output<String> apiColor;

    /**
     * @return This color will be used to highlight APIs when viewing code level data, such as distributed traces or method hotspots.
     * 
     */
    public Output<String> apiColor() {
        return this.apiColor;
    }
    /**
     * API name
     * 
     */
    @Export(name="apiName", refs={String.class}, tree="[0]")
    private Output<String> apiName;

    /**
     * @return API name
     * 
     */
    public Output<String> apiName() {
        return this.apiName;
    }
    /**
     * List of conditions
     * 
     */
    @Export(name="conditions", refs={ApiDetectionConditions.class}, tree="[0]")
    private Output</* @Nullable */ ApiDetectionConditions> conditions;

    /**
     * @return List of conditions
     * 
     */
    public Output<Optional<ApiDetectionConditions>> conditions() {
        return Codegen.optional(this.conditions);
    }
    /**
     * Restrict this rule to a specific technology.
     * 
     */
    @Export(name="technology", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> technology;

    /**
     * @return Restrict this rule to a specific technology.
     * 
     */
    public Output<Optional<String>> technology() {
        return Codegen.optional(this.technology);
    }
    /**
     * This API defines a third party library
     * 
     */
    @Export(name="thirdPartyApi", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> thirdPartyApi;

    /**
     * @return This API defines a third party library
     * 
     */
    public Output<Boolean> thirdPartyApi() {
        return this.thirdPartyApi;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ApiDetection(String name) {
        this(name, ApiDetectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApiDetection(String name, ApiDetectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApiDetection(String name, ApiDetectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/apiDetection:ApiDetection", name, args == null ? ApiDetectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ApiDetection(String name, Output<String> id, @Nullable ApiDetectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/apiDetection:ApiDetection", name, state, makeResourceOptions(options, id));
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
    public static ApiDetection get(String name, Output<String> id, @Nullable ApiDetectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ApiDetection(name, id, state, options);
    }
}
