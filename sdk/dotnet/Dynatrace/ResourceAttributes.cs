// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Dynatrace
{
    [DynatraceResourceType("dynatrace:index/resourceAttributes:ResourceAttributes")]
    public partial class ResourceAttributes : global::Pulumi.CustomResource
    {
        /// <summary>
        /// configured attributes that currently shouldn't be taken into consideration
        /// </summary>
        [Output("disableds")]
        public Output<ImmutableArray<string>> Disableds { get; private set; } = null!;

        /// <summary>
        /// attributes that should get captured
        /// </summary>
        [Output("enableds")]
        public Output<ImmutableArray<string>> Enableds { get; private set; } = null!;


        /// <summary>
        /// Create a ResourceAttributes resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ResourceAttributes(string name, ResourceAttributesArgs? args = null, CustomResourceOptions? options = null)
            : base("dynatrace:index/resourceAttributes:ResourceAttributes", name, args ?? new ResourceAttributesArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ResourceAttributes(string name, Input<string> id, ResourceAttributesState? state = null, CustomResourceOptions? options = null)
            : base("dynatrace:index/resourceAttributes:ResourceAttributes", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/lbrlabs",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ResourceAttributes resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ResourceAttributes Get(string name, Input<string> id, ResourceAttributesState? state = null, CustomResourceOptions? options = null)
        {
            return new ResourceAttributes(name, id, state, options);
        }
    }

    public sealed class ResourceAttributesArgs : global::Pulumi.ResourceArgs
    {
        [Input("disableds")]
        private InputList<string>? _disableds;

        /// <summary>
        /// configured attributes that currently shouldn't be taken into consideration
        /// </summary>
        public InputList<string> Disableds
        {
            get => _disableds ?? (_disableds = new InputList<string>());
            set => _disableds = value;
        }

        [Input("enableds")]
        private InputList<string>? _enableds;

        /// <summary>
        /// attributes that should get captured
        /// </summary>
        public InputList<string> Enableds
        {
            get => _enableds ?? (_enableds = new InputList<string>());
            set => _enableds = value;
        }

        public ResourceAttributesArgs()
        {
        }
        public static new ResourceAttributesArgs Empty => new ResourceAttributesArgs();
    }

    public sealed class ResourceAttributesState : global::Pulumi.ResourceArgs
    {
        [Input("disableds")]
        private InputList<string>? _disableds;

        /// <summary>
        /// configured attributes that currently shouldn't be taken into consideration
        /// </summary>
        public InputList<string> Disableds
        {
            get => _disableds ?? (_disableds = new InputList<string>());
            set => _disableds = value;
        }

        [Input("enableds")]
        private InputList<string>? _enableds;

        /// <summary>
        /// attributes that should get captured
        /// </summary>
        public InputList<string> Enableds
        {
            get => _enableds ?? (_enableds = new InputList<string>());
            set => _enableds = value;
        }

        public ResourceAttributesState()
        {
        }
        public static new ResourceAttributesState Empty => new ResourceAttributesState();
    }
}
