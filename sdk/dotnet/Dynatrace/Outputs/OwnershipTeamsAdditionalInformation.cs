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
    public sealed class OwnershipTeamsAdditionalInformation
    {
        /// <summary>
        /// Define key/value pairs that further describe this team — for example, cost center, solution type, or business unit assignments.
        /// </summary>
        public readonly ImmutableArray<Outputs.OwnershipTeamsAdditionalInformationAdditionalInformation> AdditionalInformations;

        [OutputConstructor]
        private OwnershipTeamsAdditionalInformation(ImmutableArray<Outputs.OwnershipTeamsAdditionalInformationAdditionalInformation> additionalInformations)
        {
            AdditionalInformations = additionalInformations;
        }
    }
}