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
    public sealed class BrowserMonitorScriptEventsEventClickWaitValidationTarget
    {
        public readonly ImmutableArray<Outputs.BrowserMonitorScriptEventsEventClickWaitValidationTargetLocator> Locators;
        public readonly string? Window;

        [OutputConstructor]
        private BrowserMonitorScriptEventsEventClickWaitValidationTarget(
            ImmutableArray<Outputs.BrowserMonitorScriptEventsEventClickWaitValidationTargetLocator> locators,

            string? window)
        {
            Locators = locators;
            Window = window;
        }
    }
}
