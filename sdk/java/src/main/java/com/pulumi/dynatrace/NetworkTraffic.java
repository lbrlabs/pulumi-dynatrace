// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.dynatrace.NetworkTrafficArgs;
import com.pulumi.dynatrace.Utilities;
import com.pulumi.dynatrace.inputs.NetworkTrafficState;
import com.pulumi.dynatrace.outputs.NetworkTrafficExcludeIp;
import com.pulumi.dynatrace.outputs.NetworkTrafficExcludeNic;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="dynatrace:index/networkTraffic:NetworkTraffic")
public class NetworkTraffic extends com.pulumi.resources.CustomResource {
    /**
     * Providing a host IP address, you will exclude network traffic only in calculating connectivity (other metrics will still be calculated).
     * 
     */
    @Export(name="excludeIp", refs={NetworkTrafficExcludeIp.class}, tree="[0]")
    private Output</* @Nullable */ NetworkTrafficExcludeIp> excludeIp;

    /**
     * @return Providing a host IP address, you will exclude network traffic only in calculating connectivity (other metrics will still be calculated).
     * 
     */
    public Output<Optional<NetworkTrafficExcludeIp>> excludeIp() {
        return Codegen.optional(this.excludeIp);
    }
    /**
     * Selecting a network interface, you will exclude all network traffic on that interface from being monitored. You can select from the list below what to not monitor, or input it manually using the &#34;other one&#34; option.
     * 
     */
    @Export(name="excludeNic", refs={NetworkTrafficExcludeNic.class}, tree="[0]")
    private Output</* @Nullable */ NetworkTrafficExcludeNic> excludeNic;

    /**
     * @return Selecting a network interface, you will exclude all network traffic on that interface from being monitored. You can select from the list below what to not monitor, or input it manually using the &#34;other one&#34; option.
     * 
     */
    public Output<Optional<NetworkTrafficExcludeNic>> excludeNic() {
        return Codegen.optional(this.excludeNic);
    }
    /**
     * The scope of this settings. If the settings should cover the whole environment, just don&#39;t specify any scope.
     * 
     */
    @Export(name="hostId", refs={String.class}, tree="[0]")
    private Output<String> hostId;

    /**
     * @return The scope of this settings. If the settings should cover the whole environment, just don&#39;t specify any scope.
     * 
     */
    public Output<String> hostId() {
        return this.hostId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NetworkTraffic(String name) {
        this(name, NetworkTrafficArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NetworkTraffic(String name, NetworkTrafficArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NetworkTraffic(String name, NetworkTrafficArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/networkTraffic:NetworkTraffic", name, args == null ? NetworkTrafficArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NetworkTraffic(String name, Output<String> id, @Nullable NetworkTrafficState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/networkTraffic:NetworkTraffic", name, state, makeResourceOptions(options, id));
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
    public static NetworkTraffic get(String name, Output<String> id, @Nullable NetworkTrafficState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NetworkTraffic(name, id, state, options);
    }
}
