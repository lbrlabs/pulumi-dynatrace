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
    public sealed class BrowserMonitorScriptEventsEventClickValidateValidationTarget
    {
        public readonly ImmutableArray<Outputs.BrowserMonitorScriptEventsEventClickValidateValidationTargetLocator> Locators;
        public readonly string? Window;

        [OutputConstructor]
        private BrowserMonitorScriptEventsEventClickValidateValidationTarget(
            ImmutableArray<Outputs.BrowserMonitorScriptEventsEventClickValidateValidationTargetLocator> locators,

            string? window)
        {
            Locators = locators;
            Window = window;
        }
    }
}
