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
    public sealed class MaintenanceWindowScopeMatch
    {
        public readonly string? MzId;
        public readonly string? TagCombination;
        public readonly ImmutableArray<Outputs.MaintenanceWindowScopeMatchTag> Tags;
        /// <summary>
        /// The type of the maintenance: planned or unplanned
        /// </summary>
        public readonly string? Type;
        /// <summary>
        /// allows for configuring properties that are not explicitly supported by the current version of this provider
        /// </summary>
        public readonly string? Unknowns;

        [OutputConstructor]
        private MaintenanceWindowScopeMatch(
            string? mzId,

            string? tagCombination,

            ImmutableArray<Outputs.MaintenanceWindowScopeMatchTag> tags,

            string? type,

            string? unknowns)
        {
            MzId = mzId;
            TagCombination = tagCombination;
            Tags = tags;
            Type = type;
            Unknowns = unknowns;
        }
    }
}
