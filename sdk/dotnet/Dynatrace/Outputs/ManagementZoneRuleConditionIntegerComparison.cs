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
    public sealed class ManagementZoneRuleConditionIntegerComparison
    {
        public readonly bool? Negate;
        public readonly string Operator;
        public readonly string? Type;
        public readonly string? Unknowns;
        public readonly int? Value;

        [OutputConstructor]
        private ManagementZoneRuleConditionIntegerComparison(
            bool? negate,

            string @operator,

            string? type,

            string? unknowns,

            int? value)
        {
            Negate = negate;
            Operator = @operator;
            Type = type;
            Unknowns = unknowns;
            Value = value;
        }
    }
}
