// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.dynatrace.JsonDashboardArgs;
import com.pulumi.dynatrace.Utilities;
import com.pulumi.dynatrace.inputs.JsonDashboardState;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="dynatrace:index/jsonDashboard:JsonDashboard")
public class JsonDashboard extends com.pulumi.resources.CustomResource {
    /**
     * Contains the JSON Code of the Dashboard
     * 
     */
    @Export(name="contents", refs={String.class}, tree="[0]")
    private Output<String> contents;

    /**
     * @return Contains the JSON Code of the Dashboard
     * 
     */
    public Output<String> contents() {
        return this.contents;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public JsonDashboard(String name) {
        this(name, JsonDashboardArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public JsonDashboard(String name, JsonDashboardArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public JsonDashboard(String name, JsonDashboardArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/jsonDashboard:JsonDashboard", name, args == null ? JsonDashboardArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private JsonDashboard(String name, Output<String> id, @Nullable JsonDashboardState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/jsonDashboard:JsonDashboard", name, state, makeResourceOptions(options, id));
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
    public static JsonDashboard get(String name, Output<String> id, @Nullable JsonDashboardState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new JsonDashboard(name, id, state, options);
    }
}
