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

    public sealed class DeclarativeGroupingDetectionProcessDefinitionRulesArgs : global::Pulumi.ResourceArgs
    {
        [Input("rules", required: true)]
        private InputList<Inputs.DeclarativeGroupingDetectionProcessDefinitionRulesRuleArgs>? _rules;
        public InputList<Inputs.DeclarativeGroupingDetectionProcessDefinitionRulesRuleArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.DeclarativeGroupingDetectionProcessDefinitionRulesRuleArgs>());
            set => _rules = value;
        }

        public DeclarativeGroupingDetectionProcessDefinitionRulesArgs()
        {
        }
        public static new DeclarativeGroupingDetectionProcessDefinitionRulesArgs Empty => new DeclarativeGroupingDetectionProcessDefinitionRulesArgs();
    }
}