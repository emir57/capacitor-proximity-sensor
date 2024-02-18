export interface proximitySensorPlugin {
  activeProximitySensor(): Promise<proximityInfos>;
  deActiveProximitySensor(): Promise<proximityInfos>;
  isActive(): Promise<proximityInfos>;
}

export interface proximityInfos {
  isOpen: boolean;
}
