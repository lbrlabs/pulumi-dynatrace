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

    public sealed class RumProviderBreakdownDomainNamePatternListDomainNamePatternArgs : global::Pulumi.ResourceArgs
    {
        [Input("pattern", required: true)]
        public Input<string> Pattern { get; set; } = null!;

        public RumProviderBreakdownDomainNamePatternListDomainNamePatternArgs()
        {
        }
        public static new RumProviderBreakdownDomainNamePatternListDomainNamePatternArgs Empty => new RumProviderBreakdownDomainNamePatternListDomainNamePatternArgs();
    }
}
