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
    public sealed class CalculatedServiceMetricConditionCondition
    {
        public readonly string Attribute;
        public readonly Outputs.CalculatedServiceMetricConditionConditionComparison Comparison;
        public readonly string? Unknowns;

        [OutputConstructor]
        private CalculatedServiceMetricConditionCondition(
            string attribute,

            Outputs.CalculatedServiceMetricConditionConditionComparison comparison,

            string? unknowns)
        {
            Attribute = attribute;
            Comparison = comparison;
            Unknowns = unknowns;
        }
    }
}
