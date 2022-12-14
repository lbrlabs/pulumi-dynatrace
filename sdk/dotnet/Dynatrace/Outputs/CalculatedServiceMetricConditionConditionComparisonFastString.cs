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
    public sealed class CalculatedServiceMetricConditionConditionComparisonFastString
    {
        public readonly bool? CaseSensitive;
        public readonly string? Operator;
        public readonly string? Unknowns;
        public readonly string? Value;
        public readonly ImmutableArray<string> Values;

        [OutputConstructor]
        private CalculatedServiceMetricConditionConditionComparisonFastString(
            bool? caseSensitive,

            string? @operator,

            string? unknowns,

            string? value,

            ImmutableArray<string> values)
        {
            CaseSensitive = caseSensitive;
            Operator = @operator;
            Unknowns = unknowns;
            Value = value;
            Values = values;
        }
    }
}
