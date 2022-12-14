// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Dynatrace.Inputs
{

    public sealed class QueueManagerAliasQueueAliasQueueArgs : global::Pulumi.ResourceArgs
    {
        [Input("aliasQueueName", required: true)]
        public Input<string> AliasQueueName { get; set; } = null!;

        [Input("baseQueueName", required: true)]
        public Input<string> BaseQueueName { get; set; } = null!;

        [Input("clusterVisibilities")]
        private InputList<string>? _clusterVisibilities;
        public InputList<string> ClusterVisibilities
        {
            get => _clusterVisibilities ?? (_clusterVisibilities = new InputList<string>());
            set => _clusterVisibilities = value;
        }

        public QueueManagerAliasQueueAliasQueueArgs()
        {
        }
        public static new QueueManagerAliasQueueAliasQueueArgs Empty => new QueueManagerAliasQueueAliasQueueArgs();
    }
}
