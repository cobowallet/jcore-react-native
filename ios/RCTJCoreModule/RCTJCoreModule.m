//
//  RCTJCoreModule.m
//  RCTJCoreModule
//
//  Created by oshumini on 2017/8/8.
//  Copyright © 2017年 HXHG. All rights reserved.
//

#import "RCTJCoreModule.h"

@implementation RCTJCoreModule
RCT_EXPORT_MODULE(JCoreModule);

+ (BOOL)requiresMainQueueSetup {
	return NO;
}

RCT_EXPORT_METHOD(testCountryCode: (NSString *)core) { }

@end
