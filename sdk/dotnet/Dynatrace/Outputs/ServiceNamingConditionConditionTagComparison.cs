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
    public sealed class ServiceNamingConditionConditionTagComparison
    {
        public readonly bool? Negate;
        public readonly string Operator;
        public readonly string? Type;
        public readonly string? Unknowns;
        public readonly Outputs.ServiceNamingConditionConditionTagComparisonValue? Value;

        [OutputConstructor]
        private ServiceNamingConditionConditionTagComparison(
            bool? negate,

            string @operator,

            string? type,

            string? unknowns,

            Outputs.ServiceNamingConditionConditionTagComparisonValue? value)
        {
            Negate = negate;
            Operator = @operator;
            Type = type;
            Unknowns = unknowns;
            Value = value;
        }
    }
}
