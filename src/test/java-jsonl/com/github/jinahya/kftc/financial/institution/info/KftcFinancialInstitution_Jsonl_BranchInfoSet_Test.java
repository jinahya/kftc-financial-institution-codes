package com.github.jinahya.kftc.financial.institution.info;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.io.IOException;

@Slf4j
class KftcFinancialInstitution_Jsonl_BranchInfoSet_Test
        extends KftcFinancialInstitution_Jsonl__Test {

    @Test
    void __() throws IOException {
        final var infoSet = KftcFinancialInstitutionBranchInfoSet.newInstance();
        final var list = infoSet.getList();
        final var path = _IoTestUtils.buildOutputFile("codefilex.jsonl");
        writeValues(list, path.toFile());
    }
}