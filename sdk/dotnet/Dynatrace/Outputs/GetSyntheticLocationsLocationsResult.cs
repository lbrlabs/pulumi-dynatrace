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
    public sealed class GetSyntheticLocationsLocationsResult
    {
        /// <summary>
        /// The cloud provider where the location is hosted.
        /// </summary>
        public readonly string CloudPlatform;
        public readonly string? EntityId;
        public readonly ImmutableArray<string> Ips;
        public readonly string? Name;
        public readonly string Stage;
        public readonly string Status;
        public readonly string? Type;

        [OutputConstructor]
        private GetSyntheticLocationsLocationsResult(
            string cloudPlatform,

            string? entityId,

            ImmutableArray<string> ips,

            string? name,

            string stage,

            string status,

            string? type)
        {
            CloudPlatform = cloudPlatform;
            EntityId = entityId;
            Ips = ips;
            Name = name;
            Stage = stage;
            Status = status;
            Type = type;
        }
    }
}
