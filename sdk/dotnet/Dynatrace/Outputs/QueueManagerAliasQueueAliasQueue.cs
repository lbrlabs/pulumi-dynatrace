// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Dynatrace.Outputs
{

    [OutputType]
    public sealed class QueueManagerAliasQueueAliasQueue
    {
        public readonly string AliasQueueName;
        public readonly string BaseQueueName;
        public readonly ImmutableArray<string> ClusterVisibilities;

        [OutputConstructor]
        private QueueManagerAliasQueueAliasQueue(
            string aliasQueueName,

            string baseQueueName,

            ImmutableArray<string> clusterVisibilities)
        {
            AliasQueueName = aliasQueueName;
            BaseQueueName = baseQueueName;
            ClusterVisibilities = clusterVisibilities;
        }
    }
}
