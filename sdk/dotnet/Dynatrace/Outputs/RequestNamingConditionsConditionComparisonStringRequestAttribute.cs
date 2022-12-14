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
    public sealed class RequestNamingConditionsConditionComparisonStringRequestAttribute
    {
        public readonly bool? CaseSensitive;
        public readonly bool? MatchOnChildCalls;
        public readonly string? Operator;
        public readonly string RequestAttribute;
        public readonly Outputs.RequestNamingConditionsConditionComparisonStringRequestAttributeSource? Source;
        public readonly string? Unknowns;
        public readonly string? Value;
        public readonly ImmutableArray<string> Values;

        [OutputConstructor]
        private RequestNamingConditionsConditionComparisonStringRequestAttribute(
            bool? caseSensitive,

            bool? matchOnChildCalls,

            string? @operator,

            string requestAttribute,

            Outputs.RequestNamingConditionsConditionComparisonStringRequestAttributeSource? source,

            string? unknowns,

            string? value,

            ImmutableArray<string> values)
        {
            CaseSensitive = caseSensitive;
            MatchOnChildCalls = matchOnChildCalls;
            Operator = @operator;
            RequestAttribute = requestAttribute;
            Source = source;
            Unknowns = unknowns;
            Value = value;
            Values = values;
        }
    }
}
