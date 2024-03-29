// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.dynatrace.GenericRelationshipsArgs;
import com.pulumi.dynatrace.Utilities;
import com.pulumi.dynatrace.inputs.GenericRelationshipsState;
import com.pulumi.dynatrace.outputs.GenericRelationshipsSources;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="dynatrace:index/genericRelationships:GenericRelationships")
public class GenericRelationships extends com.pulumi.resources.CustomResource {
    /**
     * The user or extension that created this relationship.
     * 
     */
    @Export(name="createdBy", refs={String.class}, tree="[0]")
    private Output<String> createdBy;

    /**
     * @return The user or extension that created this relationship.
     * 
     */
    public Output<String> createdBy() {
        return this.createdBy;
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
     * Specify a role for the source entity. If both source and destination type are the same, referring different roles will allow identification of a relationships direction. If role is left blank, any role of the source type is considered for the relationship.
     * 
     */
    @Export(name="fromRole", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> fromRole;

    /**
     * @return Specify a role for the source entity. If both source and destination type are the same, referring different roles will allow identification of a relationships direction. If role is left blank, any role of the source type is considered for the relationship.
     * 
     */
    public Output<Optional<String>> fromRole() {
        return Codegen.optional(this.fromRole);
    }
    /**
     * Define an entity type as the source of the relationship.
     * 
     */
    @Export(name="fromType", refs={String.class}, tree="[0]")
    private Output<String> fromType;

    /**
     * @return Define an entity type as the source of the relationship.
     * 
     */
    public Output<String> fromType() {
        return this.fromType;
    }
    /**
     * Specify all sources which should be evaluated for this relationship rule. The relationship is only created when any of the filters match.
     * 
     */
    @Export(name="sources", refs={GenericRelationshipsSources.class}, tree="[0]")
    private Output<GenericRelationshipsSources> sources;

    /**
     * @return Specify all sources which should be evaluated for this relationship rule. The relationship is only created when any of the filters match.
     * 
     */
    public Output<GenericRelationshipsSources> sources() {
        return this.sources;
    }
    /**
     * Specify a role for the destination entity. If both source and destination type are the same, referring different roles will allow identification of a relationships direction. If role is left blank, any role of the destination type is considered for the relationship.
     * 
     */
    @Export(name="toRole", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> toRole;

    /**
     * @return Specify a role for the destination entity. If both source and destination type are the same, referring different roles will allow identification of a relationships direction. If role is left blank, any role of the destination type is considered for the relationship.
     * 
     */
    public Output<Optional<String>> toRole() {
        return Codegen.optional(this.toRole);
    }
    /**
     * Define an entity type as the destination of the relationship. You can choose the same type as the source type. In this case you also may assign different roles for source and destination for having directed relationships.
     * 
     */
    @Export(name="toType", refs={String.class}, tree="[0]")
    private Output<String> toType;

    /**
     * @return Define an entity type as the destination of the relationship. You can choose the same type as the source type. In this case you also may assign different roles for source and destination for having directed relationships.
     * 
     */
    public Output<String> toType() {
        return this.toType;
    }
    /**
     * Possible Values: `CALLS`, `CHILD_OF`, `INSTANCE_OF`, `PART_OF`, `RUNS_ON`, `SAME_AS`
     * 
     */
    @Export(name="typeOfRelation", refs={String.class}, tree="[0]")
    private Output<String> typeOfRelation;

    /**
     * @return Possible Values: `CALLS`, `CHILD_OF`, `INSTANCE_OF`, `PART_OF`, `RUNS_ON`, `SAME_AS`
     * 
     */
    public Output<String> typeOfRelation() {
        return this.typeOfRelation;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GenericRelationships(String name) {
        this(name, GenericRelationshipsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GenericRelationships(String name, GenericRelationshipsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GenericRelationships(String name, GenericRelationshipsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/genericRelationships:GenericRelationships", name, args == null ? GenericRelationshipsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GenericRelationships(String name, Output<String> id, @Nullable GenericRelationshipsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dynatrace:index/genericRelationships:GenericRelationships", name, state, makeResourceOptions(options, id));
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
    public static GenericRelationships get(String name, Output<String> id, @Nullable GenericRelationshipsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GenericRelationships(name, id, state, options);
    }
}
