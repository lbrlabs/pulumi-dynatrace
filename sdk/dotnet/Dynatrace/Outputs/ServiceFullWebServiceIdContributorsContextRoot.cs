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
    public sealed class ServiceFullWebServiceIdContributorsContextRoot
    {
        public readonly bool EnableIdContributor;
        public readonly Outputs.ServiceFullWebServiceIdContributorsContextRootServiceIdContributor? ServiceIdContributor;

        [OutputConstructor]
        private ServiceFullWebServiceIdContributorsContextRoot(
            bool enableIdContributor,

            Outputs.ServiceFullWebServiceIdContributorsContextRootServiceIdContributor? serviceIdContributor)
        {
            EnableIdContributor = enableIdContributor;
            ServiceIdContributor = serviceIdContributor;
        }
    }
}
