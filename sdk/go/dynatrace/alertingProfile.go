// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dynatrace

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type AlertingProfile struct {
	pulumi.CustomResourceState

	// The name of the alerting profile, displayed in the UI
	DisplayName pulumi.StringOutput `pulumi:"displayName"`
	// The list of event filters.  For all filters that are *negated* inside of these event filters, that is all `Predefined` as well as `Custom` (Title and/or Description) ones the AND logic applies. For all *non-negated* ones the OR logic applies. Between these two groups, negated and non-negated, the AND logic applies.  If you specify both severity rule and event filter, the AND logic applies
	EventTypeFilters AlertingProfileEventTypeFilterArrayOutput `pulumi:"eventTypeFilters"`
	// `metadata` exists for backwards compatibility but shouldn't get specified anymore
	//
	// Deprecated: `metadata` exists for backwards compatibility but shouldn't get specified anymore
	Metadata AlertingProfileMetadataPtrOutput `pulumi:"metadata"`
	// The ID of the management zone to which the alerting profile applies
	MzId pulumi.StringPtrOutput `pulumi:"mzId"`
	// A list of rules for management zone usage.  Each rule is evaluated independently of all other rules
	Rules AlertingProfileRuleArrayOutput `pulumi:"rules"`
	// allows for configuring properties that are not explicitly supported by the current version of this provider
	Unknowns pulumi.StringPtrOutput `pulumi:"unknowns"`
}

// NewAlertingProfile registers a new resource with the given unique name, arguments, and options.
func NewAlertingProfile(ctx *pulumi.Context,
	name string, args *AlertingProfileArgs, opts ...pulumi.ResourceOption) (*AlertingProfile, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DisplayName == nil {
		return nil, errors.New("invalid value for required argument 'DisplayName'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource AlertingProfile
	err := ctx.RegisterResource("dynatrace:index/alertingProfile:AlertingProfile", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAlertingProfile gets an existing AlertingProfile resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAlertingProfile(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AlertingProfileState, opts ...pulumi.ResourceOption) (*AlertingProfile, error) {
	var resource AlertingProfile
	err := ctx.ReadResource("dynatrace:index/alertingProfile:AlertingProfile", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AlertingProfile resources.
type alertingProfileState struct {
	// The name of the alerting profile, displayed in the UI
	DisplayName *string `pulumi:"displayName"`
	// The list of event filters.  For all filters that are *negated* inside of these event filters, that is all `Predefined` as well as `Custom` (Title and/or Description) ones the AND logic applies. For all *non-negated* ones the OR logic applies. Between these two groups, negated and non-negated, the AND logic applies.  If you specify both severity rule and event filter, the AND logic applies
	EventTypeFilters []AlertingProfileEventTypeFilter `pulumi:"eventTypeFilters"`
	// `metadata` exists for backwards compatibility but shouldn't get specified anymore
	//
	// Deprecated: `metadata` exists for backwards compatibility but shouldn't get specified anymore
	Metadata *AlertingProfileMetadata `pulumi:"metadata"`
	// The ID of the management zone to which the alerting profile applies
	MzId *string `pulumi:"mzId"`
	// A list of rules for management zone usage.  Each rule is evaluated independently of all other rules
	Rules []AlertingProfileRule `pulumi:"rules"`
	// allows for configuring properties that are not explicitly supported by the current version of this provider
	Unknowns *string `pulumi:"unknowns"`
}

type AlertingProfileState struct {
	// The name of the alerting profile, displayed in the UI
	DisplayName pulumi.StringPtrInput
	// The list of event filters.  For all filters that are *negated* inside of these event filters, that is all `Predefined` as well as `Custom` (Title and/or Description) ones the AND logic applies. For all *non-negated* ones the OR logic applies. Between these two groups, negated and non-negated, the AND logic applies.  If you specify both severity rule and event filter, the AND logic applies
	EventTypeFilters AlertingProfileEventTypeFilterArrayInput
	// `metadata` exists for backwards compatibility but shouldn't get specified anymore
	//
	// Deprecated: `metadata` exists for backwards compatibility but shouldn't get specified anymore
	Metadata AlertingProfileMetadataPtrInput
	// The ID of the management zone to which the alerting profile applies
	MzId pulumi.StringPtrInput
	// A list of rules for management zone usage.  Each rule is evaluated independently of all other rules
	Rules AlertingProfileRuleArrayInput
	// allows for configuring properties that are not explicitly supported by the current version of this provider
	Unknowns pulumi.StringPtrInput
}

func (AlertingProfileState) ElementType() reflect.Type {
	return reflect.TypeOf((*alertingProfileState)(nil)).Elem()
}

type alertingProfileArgs struct {
	// The name of the alerting profile, displayed in the UI
	DisplayName string `pulumi:"displayName"`
	// The list of event filters.  For all filters that are *negated* inside of these event filters, that is all `Predefined` as well as `Custom` (Title and/or Description) ones the AND logic applies. For all *non-negated* ones the OR logic applies. Between these two groups, negated and non-negated, the AND logic applies.  If you specify both severity rule and event filter, the AND logic applies
	EventTypeFilters []AlertingProfileEventTypeFilter `pulumi:"eventTypeFilters"`
	// `metadata` exists for backwards compatibility but shouldn't get specified anymore
	//
	// Deprecated: `metadata` exists for backwards compatibility but shouldn't get specified anymore
	Metadata *AlertingProfileMetadata `pulumi:"metadata"`
	// The ID of the management zone to which the alerting profile applies
	MzId *string `pulumi:"mzId"`
	// A list of rules for management zone usage.  Each rule is evaluated independently of all other rules
	Rules []AlertingProfileRule `pulumi:"rules"`
	// allows for configuring properties that are not explicitly supported by the current version of this provider
	Unknowns *string `pulumi:"unknowns"`
}

// The set of arguments for constructing a AlertingProfile resource.
type AlertingProfileArgs struct {
	// The name of the alerting profile, displayed in the UI
	DisplayName pulumi.StringInput
	// The list of event filters.  For all filters that are *negated* inside of these event filters, that is all `Predefined` as well as `Custom` (Title and/or Description) ones the AND logic applies. For all *non-negated* ones the OR logic applies. Between these two groups, negated and non-negated, the AND logic applies.  If you specify both severity rule and event filter, the AND logic applies
	EventTypeFilters AlertingProfileEventTypeFilterArrayInput
	// `metadata` exists for backwards compatibility but shouldn't get specified anymore
	//
	// Deprecated: `metadata` exists for backwards compatibility but shouldn't get specified anymore
	Metadata AlertingProfileMetadataPtrInput
	// The ID of the management zone to which the alerting profile applies
	MzId pulumi.StringPtrInput
	// A list of rules for management zone usage.  Each rule is evaluated independently of all other rules
	Rules AlertingProfileRuleArrayInput
	// allows for configuring properties that are not explicitly supported by the current version of this provider
	Unknowns pulumi.StringPtrInput
}

func (AlertingProfileArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*alertingProfileArgs)(nil)).Elem()
}

type AlertingProfileInput interface {
	pulumi.Input

	ToAlertingProfileOutput() AlertingProfileOutput
	ToAlertingProfileOutputWithContext(ctx context.Context) AlertingProfileOutput
}

func (*AlertingProfile) ElementType() reflect.Type {
	return reflect.TypeOf((**AlertingProfile)(nil)).Elem()
}

func (i *AlertingProfile) ToAlertingProfileOutput() AlertingProfileOutput {
	return i.ToAlertingProfileOutputWithContext(context.Background())
}

func (i *AlertingProfile) ToAlertingProfileOutputWithContext(ctx context.Context) AlertingProfileOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AlertingProfileOutput)
}

// AlertingProfileArrayInput is an input type that accepts AlertingProfileArray and AlertingProfileArrayOutput values.
// You can construct a concrete instance of `AlertingProfileArrayInput` via:
//
//	AlertingProfileArray{ AlertingProfileArgs{...} }
type AlertingProfileArrayInput interface {
	pulumi.Input

	ToAlertingProfileArrayOutput() AlertingProfileArrayOutput
	ToAlertingProfileArrayOutputWithContext(context.Context) AlertingProfileArrayOutput
}

type AlertingProfileArray []AlertingProfileInput

func (AlertingProfileArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AlertingProfile)(nil)).Elem()
}

func (i AlertingProfileArray) ToAlertingProfileArrayOutput() AlertingProfileArrayOutput {
	return i.ToAlertingProfileArrayOutputWithContext(context.Background())
}

func (i AlertingProfileArray) ToAlertingProfileArrayOutputWithContext(ctx context.Context) AlertingProfileArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AlertingProfileArrayOutput)
}

// AlertingProfileMapInput is an input type that accepts AlertingProfileMap and AlertingProfileMapOutput values.
// You can construct a concrete instance of `AlertingProfileMapInput` via:
//
//	AlertingProfileMap{ "key": AlertingProfileArgs{...} }
type AlertingProfileMapInput interface {
	pulumi.Input

	ToAlertingProfileMapOutput() AlertingProfileMapOutput
	ToAlertingProfileMapOutputWithContext(context.Context) AlertingProfileMapOutput
}

type AlertingProfileMap map[string]AlertingProfileInput

func (AlertingProfileMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AlertingProfile)(nil)).Elem()
}

func (i AlertingProfileMap) ToAlertingProfileMapOutput() AlertingProfileMapOutput {
	return i.ToAlertingProfileMapOutputWithContext(context.Background())
}

func (i AlertingProfileMap) ToAlertingProfileMapOutputWithContext(ctx context.Context) AlertingProfileMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AlertingProfileMapOutput)
}

type AlertingProfileOutput struct{ *pulumi.OutputState }

func (AlertingProfileOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AlertingProfile)(nil)).Elem()
}

func (o AlertingProfileOutput) ToAlertingProfileOutput() AlertingProfileOutput {
	return o
}

func (o AlertingProfileOutput) ToAlertingProfileOutputWithContext(ctx context.Context) AlertingProfileOutput {
	return o
}

// The name of the alerting profile, displayed in the UI
func (o AlertingProfileOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v *AlertingProfile) pulumi.StringOutput { return v.DisplayName }).(pulumi.StringOutput)
}

// The list of event filters.  For all filters that are *negated* inside of these event filters, that is all `Predefined` as well as `Custom` (Title and/or Description) ones the AND logic applies. For all *non-negated* ones the OR logic applies. Between these two groups, negated and non-negated, the AND logic applies.  If you specify both severity rule and event filter, the AND logic applies
func (o AlertingProfileOutput) EventTypeFilters() AlertingProfileEventTypeFilterArrayOutput {
	return o.ApplyT(func(v *AlertingProfile) AlertingProfileEventTypeFilterArrayOutput { return v.EventTypeFilters }).(AlertingProfileEventTypeFilterArrayOutput)
}

// `metadata` exists for backwards compatibility but shouldn't get specified anymore
//
// Deprecated: `metadata` exists for backwards compatibility but shouldn't get specified anymore
func (o AlertingProfileOutput) Metadata() AlertingProfileMetadataPtrOutput {
	return o.ApplyT(func(v *AlertingProfile) AlertingProfileMetadataPtrOutput { return v.Metadata }).(AlertingProfileMetadataPtrOutput)
}

// The ID of the management zone to which the alerting profile applies
func (o AlertingProfileOutput) MzId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AlertingProfile) pulumi.StringPtrOutput { return v.MzId }).(pulumi.StringPtrOutput)
}

// A list of rules for management zone usage.  Each rule is evaluated independently of all other rules
func (o AlertingProfileOutput) Rules() AlertingProfileRuleArrayOutput {
	return o.ApplyT(func(v *AlertingProfile) AlertingProfileRuleArrayOutput { return v.Rules }).(AlertingProfileRuleArrayOutput)
}

// allows for configuring properties that are not explicitly supported by the current version of this provider
func (o AlertingProfileOutput) Unknowns() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AlertingProfile) pulumi.StringPtrOutput { return v.Unknowns }).(pulumi.StringPtrOutput)
}

type AlertingProfileArrayOutput struct{ *pulumi.OutputState }

func (AlertingProfileArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AlertingProfile)(nil)).Elem()
}

func (o AlertingProfileArrayOutput) ToAlertingProfileArrayOutput() AlertingProfileArrayOutput {
	return o
}

func (o AlertingProfileArrayOutput) ToAlertingProfileArrayOutputWithContext(ctx context.Context) AlertingProfileArrayOutput {
	return o
}

func (o AlertingProfileArrayOutput) Index(i pulumi.IntInput) AlertingProfileOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AlertingProfile {
		return vs[0].([]*AlertingProfile)[vs[1].(int)]
	}).(AlertingProfileOutput)
}

type AlertingProfileMapOutput struct{ *pulumi.OutputState }

func (AlertingProfileMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AlertingProfile)(nil)).Elem()
}

func (o AlertingProfileMapOutput) ToAlertingProfileMapOutput() AlertingProfileMapOutput {
	return o
}

func (o AlertingProfileMapOutput) ToAlertingProfileMapOutputWithContext(ctx context.Context) AlertingProfileMapOutput {
	return o
}

func (o AlertingProfileMapOutput) MapIndex(k pulumi.StringInput) AlertingProfileOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AlertingProfile {
		return vs[0].(map[string]*AlertingProfile)[vs[1].(string)]
	}).(AlertingProfileOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AlertingProfileInput)(nil)).Elem(), &AlertingProfile{})
	pulumi.RegisterInputType(reflect.TypeOf((*AlertingProfileArrayInput)(nil)).Elem(), AlertingProfileArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AlertingProfileMapInput)(nil)).Elem(), AlertingProfileMap{})
	pulumi.RegisterOutputType(AlertingProfileOutput{})
	pulumi.RegisterOutputType(AlertingProfileArrayOutput{})
	pulumi.RegisterOutputType(AlertingProfileMapOutput{})
}
