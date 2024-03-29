// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.dynatrace.SloNormalizationArgs;
import com.pulumi.dynatrace.Utilities;
import com.pulumi.dynatrace.inputs.SloNormalizationState;
import java.lang.Boolean;
import javax.annotation.Nullable;

@ResourceType(type="dynatrace:index/sloNormalization:SloNormalization")
public class SloNormalization extends com.pulumi.resources.CustomResource {
    /**
     * When set to true, the error budget left will be shown in percent of the total error budget. For more details see [SLO normalization help](https://dt-url.net/slo-normalize-error-budget).
     * 
     */
    @Export(name="normalize", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> normalize;

    /**
     * @return When set to true, the error budget left will be shown in percent of the total error budget. For more details see [SLO normalization help](https://dt-url.net/slo-normalize-error-budget).
     * 
     */
    public Output<Boolean> normalize() {
        return this.normalize;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SloNormalization(String name) {
        this(name, SloNormalizationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SloNormalization(String name, SloNormalizationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SloNormalization(String name, SloNormalizationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/sloNormalization:SloNormalization", name, args == null ? SloNormalizationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SloNormalization(String name, Output<String> id, @Nullable SloNormalizationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/sloNormalization:SloNormalization", name, state, makeResourceOptions(options, id));
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
    public static SloNormalization get(String name, Output<String> id, @Nullable SloNormalizationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SloNormalization(name, id, state, options);
    }
}
