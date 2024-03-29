// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.dynatrace.ContainerBuiltinRuleArgs;
import com.pulumi.dynatrace.Utilities;
import com.pulumi.dynatrace.inputs.ContainerBuiltinRuleState;
import java.lang.Boolean;
import javax.annotation.Nullable;

@ResourceType(type="dynatrace:index/containerBuiltinRule:ContainerBuiltinRule")
public class ContainerBuiltinRule extends com.pulumi.resources.CustomResource {
    /**
     * Disable monitoring of platform internal pause containers in Kubernetes and OpenShift.
     * 
     */
    @Export(name="ignoreDockerPauseContainer", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> ignoreDockerPauseContainer;

    /**
     * @return Disable monitoring of platform internal pause containers in Kubernetes and OpenShift.
     * 
     */
    public Output<Boolean> ignoreDockerPauseContainer() {
        return this.ignoreDockerPauseContainer;
    }
    /**
     * Disable monitoring of platform internal pause containers in Kubernetes and OpenShift.
     * 
     */
    @Export(name="ignoreKubernetesPauseContainer", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> ignoreKubernetesPauseContainer;

    /**
     * @return Disable monitoring of platform internal pause containers in Kubernetes and OpenShift.
     * 
     */
    public Output<Boolean> ignoreKubernetesPauseContainer() {
        return this.ignoreKubernetesPauseContainer;
    }
    /**
     * Disable monitoring of intermediate containers created during image build.
     * 
     */
    @Export(name="ignoreOpenShiftBuildPodName", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> ignoreOpenShiftBuildPodName;

    /**
     * @return Disable monitoring of intermediate containers created during image build.
     * 
     */
    public Output<Boolean> ignoreOpenShiftBuildPodName() {
        return this.ignoreOpenShiftBuildPodName;
    }
    /**
     * Disable monitoring of platform internal containers in the openshift-sdn namespace.
     * 
     */
    @Export(name="ignoreOpenShiftSdnNamespace", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> ignoreOpenShiftSdnNamespace;

    /**
     * @return Disable monitoring of platform internal containers in the openshift-sdn namespace.
     * 
     */
    public Output<Boolean> ignoreOpenShiftSdnNamespace() {
        return this.ignoreOpenShiftSdnNamespace;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ContainerBuiltinRule(String name) {
        this(name, ContainerBuiltinRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ContainerBuiltinRule(String name, ContainerBuiltinRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ContainerBuiltinRule(String name, ContainerBuiltinRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/containerBuiltinRule:ContainerBuiltinRule", name, args == null ? ContainerBuiltinRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ContainerBuiltinRule(String name, Output<String> id, @Nullable ContainerBuiltinRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/containerBuiltinRule:ContainerBuiltinRule", name, state, makeResourceOptions(options, id));
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
    public static ContainerBuiltinRule get(String name, Output<String> id, @Nullable ContainerBuiltinRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ContainerBuiltinRule(name, id, state, options);
    }
}
