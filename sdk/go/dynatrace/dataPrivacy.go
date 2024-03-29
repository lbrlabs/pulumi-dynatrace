// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dynatrace

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type DataPrivacy struct {
	pulumi.CustomResourceState

	// The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
	ApplicationId pulumi.StringPtrOutput `pulumi:"applicationId"`
	// (Field has overlap with `ApplicationDataPrivacy`) To provide your end users with the ability to decide for themselves if their activities should be tracked to measure application performance and usage, enable opt-in mode.
	DataCollection DataPrivacyDataCollectionOutput `pulumi:"dataCollection"`
	// (Field has overlap with `ApplicationDataPrivacy`) Most modern web browsers have a privacy feature called ["Do Not Track"](https://dt-url.net/sb3n0pnl) that individual users may have enabled on their devices. Customize how Dynatrace should behave when it encounters this setting.
	DoNotTrack DataPrivacyDoNotTrackOutput `pulumi:"doNotTrack"`
	// (Field has overlap with `ApplicationDataPrivacy`)
	Masking DataPrivacyMaskingOutput `pulumi:"masking"`
	// (Field has overlap with `ApplicationDataPrivacy`) User tracking
	UserTracking DataPrivacyUserTrackingOutput `pulumi:"userTracking"`
}

// NewDataPrivacy registers a new resource with the given unique name, arguments, and options.
func NewDataPrivacy(ctx *pulumi.Context,
	name string, args *DataPrivacyArgs, opts ...pulumi.ResourceOption) (*DataPrivacy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DataCollection == nil {
		return nil, errors.New("invalid value for required argument 'DataCollection'")
	}
	if args.DoNotTrack == nil {
		return nil, errors.New("invalid value for required argument 'DoNotTrack'")
	}
	if args.Masking == nil {
		return nil, errors.New("invalid value for required argument 'Masking'")
	}
	if args.UserTracking == nil {
		return nil, errors.New("invalid value for required argument 'UserTracking'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource DataPrivacy
	err := ctx.RegisterResource("dynatrace:index/dataPrivacy:DataPrivacy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDataPrivacy gets an existing DataPrivacy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDataPrivacy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DataPrivacyState, opts ...pulumi.ResourceOption) (*DataPrivacy, error) {
	var resource DataPrivacy
	err := ctx.ReadResource("dynatrace:index/dataPrivacy:DataPrivacy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DataPrivacy resources.
type dataPrivacyState struct {
	// The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
	ApplicationId *string `pulumi:"applicationId"`
	// (Field has overlap with `ApplicationDataPrivacy`) To provide your end users with the ability to decide for themselves if their activities should be tracked to measure application performance and usage, enable opt-in mode.
	DataCollection *DataPrivacyDataCollection `pulumi:"dataCollection"`
	// (Field has overlap with `ApplicationDataPrivacy`) Most modern web browsers have a privacy feature called ["Do Not Track"](https://dt-url.net/sb3n0pnl) that individual users may have enabled on their devices. Customize how Dynatrace should behave when it encounters this setting.
	DoNotTrack *DataPrivacyDoNotTrack `pulumi:"doNotTrack"`
	// (Field has overlap with `ApplicationDataPrivacy`)
	Masking *DataPrivacyMasking `pulumi:"masking"`
	// (Field has overlap with `ApplicationDataPrivacy`) User tracking
	UserTracking *DataPrivacyUserTracking `pulumi:"userTracking"`
}

type DataPrivacyState struct {
	// The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
	ApplicationId pulumi.StringPtrInput
	// (Field has overlap with `ApplicationDataPrivacy`) To provide your end users with the ability to decide for themselves if their activities should be tracked to measure application performance and usage, enable opt-in mode.
	DataCollection DataPrivacyDataCollectionPtrInput
	// (Field has overlap with `ApplicationDataPrivacy`) Most modern web browsers have a privacy feature called ["Do Not Track"](https://dt-url.net/sb3n0pnl) that individual users may have enabled on their devices. Customize how Dynatrace should behave when it encounters this setting.
	DoNotTrack DataPrivacyDoNotTrackPtrInput
	// (Field has overlap with `ApplicationDataPrivacy`)
	Masking DataPrivacyMaskingPtrInput
	// (Field has overlap with `ApplicationDataPrivacy`) User tracking
	UserTracking DataPrivacyUserTrackingPtrInput
}

func (DataPrivacyState) ElementType() reflect.Type {
	return reflect.TypeOf((*dataPrivacyState)(nil)).Elem()
}

type dataPrivacyArgs struct {
	// The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
	ApplicationId *string `pulumi:"applicationId"`
	// (Field has overlap with `ApplicationDataPrivacy`) To provide your end users with the ability to decide for themselves if their activities should be tracked to measure application performance and usage, enable opt-in mode.
	DataCollection DataPrivacyDataCollection `pulumi:"dataCollection"`
	// (Field has overlap with `ApplicationDataPrivacy`) Most modern web browsers have a privacy feature called ["Do Not Track"](https://dt-url.net/sb3n0pnl) that individual users may have enabled on their devices. Customize how Dynatrace should behave when it encounters this setting.
	DoNotTrack DataPrivacyDoNotTrack `pulumi:"doNotTrack"`
	// (Field has overlap with `ApplicationDataPrivacy`)
	Masking DataPrivacyMasking `pulumi:"masking"`
	// (Field has overlap with `ApplicationDataPrivacy`) User tracking
	UserTracking DataPrivacyUserTracking `pulumi:"userTracking"`
}

// The set of arguments for constructing a DataPrivacy resource.
type DataPrivacyArgs struct {
	// The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
	ApplicationId pulumi.StringPtrInput
	// (Field has overlap with `ApplicationDataPrivacy`) To provide your end users with the ability to decide for themselves if their activities should be tracked to measure application performance and usage, enable opt-in mode.
	DataCollection DataPrivacyDataCollectionInput
	// (Field has overlap with `ApplicationDataPrivacy`) Most modern web browsers have a privacy feature called ["Do Not Track"](https://dt-url.net/sb3n0pnl) that individual users may have enabled on their devices. Customize how Dynatrace should behave when it encounters this setting.
	DoNotTrack DataPrivacyDoNotTrackInput
	// (Field has overlap with `ApplicationDataPrivacy`)
	Masking DataPrivacyMaskingInput
	// (Field has overlap with `ApplicationDataPrivacy`) User tracking
	UserTracking DataPrivacyUserTrackingInput
}

func (DataPrivacyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*dataPrivacyArgs)(nil)).Elem()
}

type DataPrivacyInput interface {
	pulumi.Input

	ToDataPrivacyOutput() DataPrivacyOutput
	ToDataPrivacyOutputWithContext(ctx context.Context) DataPrivacyOutput
}

func (*DataPrivacy) ElementType() reflect.Type {
	return reflect.TypeOf((**DataPrivacy)(nil)).Elem()
}

func (i *DataPrivacy) ToDataPrivacyOutput() DataPrivacyOutput {
	return i.ToDataPrivacyOutputWithContext(context.Background())
}

func (i *DataPrivacy) ToDataPrivacyOutputWithContext(ctx context.Context) DataPrivacyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DataPrivacyOutput)
}

// DataPrivacyArrayInput is an input type that accepts DataPrivacyArray and DataPrivacyArrayOutput values.
// You can construct a concrete instance of `DataPrivacyArrayInput` via:
//
//	DataPrivacyArray{ DataPrivacyArgs{...} }
type DataPrivacyArrayInput interface {
	pulumi.Input

	ToDataPrivacyArrayOutput() DataPrivacyArrayOutput
	ToDataPrivacyArrayOutputWithContext(context.Context) DataPrivacyArrayOutput
}

type DataPrivacyArray []DataPrivacyInput

func (DataPrivacyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DataPrivacy)(nil)).Elem()
}

func (i DataPrivacyArray) ToDataPrivacyArrayOutput() DataPrivacyArrayOutput {
	return i.ToDataPrivacyArrayOutputWithContext(context.Background())
}

func (i DataPrivacyArray) ToDataPrivacyArrayOutputWithContext(ctx context.Context) DataPrivacyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DataPrivacyArrayOutput)
}

// DataPrivacyMapInput is an input type that accepts DataPrivacyMap and DataPrivacyMapOutput values.
// You can construct a concrete instance of `DataPrivacyMapInput` via:
//
//	DataPrivacyMap{ "key": DataPrivacyArgs{...} }
type DataPrivacyMapInput interface {
	pulumi.Input

	ToDataPrivacyMapOutput() DataPrivacyMapOutput
	ToDataPrivacyMapOutputWithContext(context.Context) DataPrivacyMapOutput
}

type DataPrivacyMap map[string]DataPrivacyInput

func (DataPrivacyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DataPrivacy)(nil)).Elem()
}

func (i DataPrivacyMap) ToDataPrivacyMapOutput() DataPrivacyMapOutput {
	return i.ToDataPrivacyMapOutputWithContext(context.Background())
}

func (i DataPrivacyMap) ToDataPrivacyMapOutputWithContext(ctx context.Context) DataPrivacyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DataPrivacyMapOutput)
}

type DataPrivacyOutput struct{ *pulumi.OutputState }

func (DataPrivacyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DataPrivacy)(nil)).Elem()
}

func (o DataPrivacyOutput) ToDataPrivacyOutput() DataPrivacyOutput {
	return o
}

func (o DataPrivacyOutput) ToDataPrivacyOutputWithContext(ctx context.Context) DataPrivacyOutput {
	return o
}

// The scope of this settings. If the settings should cover the whole environment, just don't specify any scope.
func (o DataPrivacyOutput) ApplicationId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *DataPrivacy) pulumi.StringPtrOutput { return v.ApplicationId }).(pulumi.StringPtrOutput)
}

// (Field has overlap with `ApplicationDataPrivacy`) To provide your end users with the ability to decide for themselves if their activities should be tracked to measure application performance and usage, enable opt-in mode.
func (o DataPrivacyOutput) DataCollection() DataPrivacyDataCollectionOutput {
	return o.ApplyT(func(v *DataPrivacy) DataPrivacyDataCollectionOutput { return v.DataCollection }).(DataPrivacyDataCollectionOutput)
}

// (Field has overlap with `ApplicationDataPrivacy`) Most modern web browsers have a privacy feature called ["Do Not Track"](https://dt-url.net/sb3n0pnl) that individual users may have enabled on their devices. Customize how Dynatrace should behave when it encounters this setting.
func (o DataPrivacyOutput) DoNotTrack() DataPrivacyDoNotTrackOutput {
	return o.ApplyT(func(v *DataPrivacy) DataPrivacyDoNotTrackOutput { return v.DoNotTrack }).(DataPrivacyDoNotTrackOutput)
}

// (Field has overlap with `ApplicationDataPrivacy`)
func (o DataPrivacyOutput) Masking() DataPrivacyMaskingOutput {
	return o.ApplyT(func(v *DataPrivacy) DataPrivacyMaskingOutput { return v.Masking }).(DataPrivacyMaskingOutput)
}

// (Field has overlap with `ApplicationDataPrivacy`) User tracking
func (o DataPrivacyOutput) UserTracking() DataPrivacyUserTrackingOutput {
	return o.ApplyT(func(v *DataPrivacy) DataPrivacyUserTrackingOutput { return v.UserTracking }).(DataPrivacyUserTrackingOutput)
}

type DataPrivacyArrayOutput struct{ *pulumi.OutputState }

func (DataPrivacyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DataPrivacy)(nil)).Elem()
}

func (o DataPrivacyArrayOutput) ToDataPrivacyArrayOutput() DataPrivacyArrayOutput {
	return o
}

func (o DataPrivacyArrayOutput) ToDataPrivacyArrayOutputWithContext(ctx context.Context) DataPrivacyArrayOutput {
	return o
}

func (o DataPrivacyArrayOutput) Index(i pulumi.IntInput) DataPrivacyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DataPrivacy {
		return vs[0].([]*DataPrivacy)[vs[1].(int)]
	}).(DataPrivacyOutput)
}

type DataPrivacyMapOutput struct{ *pulumi.OutputState }

func (DataPrivacyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DataPrivacy)(nil)).Elem()
}

func (o DataPrivacyMapOutput) ToDataPrivacyMapOutput() DataPrivacyMapOutput {
	return o
}

func (o DataPrivacyMapOutput) ToDataPrivacyMapOutputWithContext(ctx context.Context) DataPrivacyMapOutput {
	return o
}

func (o DataPrivacyMapOutput) MapIndex(k pulumi.StringInput) DataPrivacyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DataPrivacy {
		return vs[0].(map[string]*DataPrivacy)[vs[1].(string)]
	}).(DataPrivacyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DataPrivacyInput)(nil)).Elem(), &DataPrivacy{})
	pulumi.RegisterInputType(reflect.TypeOf((*DataPrivacyArrayInput)(nil)).Elem(), DataPrivacyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DataPrivacyMapInput)(nil)).Elem(), DataPrivacyMap{})
	pulumi.RegisterOutputType(DataPrivacyOutput{})
	pulumi.RegisterOutputType(DataPrivacyArrayOutput{})
	pulumi.RegisterOutputType(DataPrivacyMapOutput{})
}
