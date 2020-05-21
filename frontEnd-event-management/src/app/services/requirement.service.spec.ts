import { TestBed, inject } from '@angular/core/testing';

import { RequirementService } from './requirement.service';

describe('RequirementService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [RequirementService]
    });
  });

  it('should be created', inject([RequirementService], (service: RequirementService) => {
    expect(service).toBeTruthy();
  }));
});
