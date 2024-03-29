// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.dynatrace.QueueManagerArgs;
import com.pulumi.dynatrace.Utilities;
import com.pulumi.dynatrace.inputs.QueueManagerState;
import com.pulumi.dynatrace.outputs.QueueManagerAliasQueue;
import com.pulumi.dynatrace.outputs.QueueManagerClusterQueue;
import com.pulumi.dynatrace.outputs.QueueManagerRemoteQueue;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="dynatrace:index/queueManager:QueueManager")
public class QueueManager extends com.pulumi.resources.CustomResource {
    /**
     * The alias queues in the queue manager
     * 
     */
    @Export(name="aliasQueues", refs={List.class,QueueManagerAliasQueue.class}, tree="[0,1]")
    private Output</* @Nullable */ List<QueueManagerAliasQueue>> aliasQueues;

    /**
     * @return The alias queues in the queue manager
     * 
     */
    public Output<Optional<List<QueueManagerAliasQueue>>> aliasQueues() {
        return Codegen.optional(this.aliasQueues);
    }
    /**
     * The alias queues in the queue manager
     * 
     */
    @Export(name="clusterQueues", refs={List.class,QueueManagerClusterQueue.class}, tree="[0,1]")
    private Output</* @Nullable */ List<QueueManagerClusterQueue>> clusterQueues;

    /**
     * @return The alias queues in the queue manager
     * 
     */
    public Output<Optional<List<QueueManagerClusterQueue>>> clusterQueues() {
        return Codegen.optional(this.clusterQueues);
    }
    /**
     * Name of the cluster(s) this queue manager is part of
     * 
     */
    @Export(name="clusters", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> clusters;

    /**
     * @return Name of the cluster(s) this queue manager is part of
     * 
     */
    public Output<Optional<List<String>>> clusters() {
        return Codegen.optional(this.clusters);
    }
    /**
     * The name of the queue manager
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the queue manager
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The alias queues in the queue manager
     * 
     */
    @Export(name="remoteQueues", refs={List.class,QueueManagerRemoteQueue.class}, tree="[0,1]")
    private Output</* @Nullable */ List<QueueManagerRemoteQueue>> remoteQueues;

    /**
     * @return The alias queues in the queue manager
     * 
     */
    public Output<Optional<List<QueueManagerRemoteQueue>>> remoteQueues() {
        return Codegen.optional(this.remoteQueues);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public QueueManager(String name) {
        this(name, QueueManagerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public QueueManager(String name, @Nullable QueueManagerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public QueueManager(String name, @Nullable QueueManagerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/queueManager:QueueManager", name, args == null ? QueueManagerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private QueueManager(String name, Output<String> id, @Nullable QueueManagerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/queueManager:QueueManager", name, state, makeResourceOptions(options, id));
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
    public static QueueManager get(String name, Output<String> id, @Nullable QueueManagerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new QueueManager(name, id, state, options);
    }
}
