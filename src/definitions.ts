export interface proximitySensorPlugin {
  activeProximitySensor(): Promise<proximityInfos>;
  deActivateProximitySensor(): Promise<proximityInfos>;
  isActive(): Promise<proximityInfos>;
}

export interface proximityInfos {
  isOpen: boolean;
}
