/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 24 18:30:18 GMT 2020
 */

package org.apache.commons.math4.stat.inference;

import org.apache.commons.math4.stat.inference.AlternativeHypothesis;
import org.apache.commons.math4.stat.inference.BinomialTest;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.evosuite.runtime.EvoAssertions.*;
import static org.junit.Assert.*;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class BinomialTest_ESTest extends BinomialTest_ESTest_scaffolding {

    /*
    * Informações do teste
    *
    * Plausível: não
    *     - O único comportamento verificado é se o teste pode ser executado no tempo de 4s. O que não se demonstra plausível
    *     para um teste que instancia as classes e chama o um método.
    *
    * Compreensivel: sim
    *     - O comportamento do teste e suas instruções são compreesíveis.
    */
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        BinomialTest binomialTest0 = new BinomialTest();
        AlternativeHypothesis alternativeHypothesis0 = AlternativeHypothesis.LESS_THAN;
        binomialTest0.binomialTest(4587, 0, (double) 0, alternativeHypothesis0);
    }

    /*
    * Informações do teste
    *
    * Plausível: não
    *     - O único comportamento verificado é se o teste pode ser executado no tempo de 4s. O que não se demonstra plausível
    *     para um teste que instancia as classes e chama o um método.
    *
    * Compreensivel: sim
    *     - O comportamento do teste e suas instruções são compreesíveis.
    */
    @Test(timeout = 4000)
    public void test01() throws Throwable {
        BinomialTest binomialTest0 = new BinomialTest();
        AlternativeHypothesis alternativeHypothesis0 = AlternativeHypothesis.GREATER_THAN;
        binomialTest0.binomialTest(3007, 0, (double) 0, alternativeHypothesis0, 2513.4813417155797);
    }

    /*
    * Informações do teste
    *
    * Plausível: não
    *     - O teste verifica dois comportamentos: primeiro se ele pode ser executado no tempo de 4s; Em seguida, se a função
    *     binomialTest() chamada com argumentos ilegais lança uma RuntimeException. A documentação especifica que para erros
    *     nos valores passados uma NotPositiveException, OutOfRangeException ou MathIllegalArgumentException será lançada.
    *
    * Compreensivel: sim
    *     - O comportamento do teste e suas instruções são compreesíveis.
    */
    @Test(timeout = 4000)
    public void test02() throws Throwable {
        BinomialTest binomialTest0 = new BinomialTest();
        AlternativeHypothesis alternativeHypothesis0 = AlternativeHypothesis.GREATER_THAN;
        // Undeclared exception!
        try {
            binomialTest0.binomialTest((-1), 2012, (double) 2012, alternativeHypothesis0);
            fail("Expecting exception: RuntimeException");

        } catch (RuntimeException e) {
            //
            // -1 is smaller than the minimum (0)
            //
            verifyException("org.apache.commons.math4.stat.inference.BinomialTest", e);
        }
    }

    /*
    * Informações do teste
    *
    * Plausível: não
    *      O único comportamento verificado é se o teste pode ser executado no tempo de 4s. O que não se demonstra plausível
    *     para um teste que instancia as classes e chama o um método.
    *
    * Compreensivel: sim
    *     - O comportamento do teste e suas instruções são compreesíveis.
    */
    @Test(timeout = 4000)
    public void test03() throws Throwable {
        BinomialTest binomialTest0 = new BinomialTest();
        AlternativeHypothesis alternativeHypothesis0 = AlternativeHypothesis.TWO_SIDED;
        binomialTest0.binomialTest(0, 0, 1.0, alternativeHypothesis0, (double) 0);
    }

    /*
    * Informações do teste
    *
    * Plausível: não
    *      O único comportamento verificado é se o teste pode ser executado no tempo de 4s. O que não se demonstra plausível
    *     para um teste que instancia as classes e chama o um método.
    *
    * Compreensivel: sim
    *     - O comportamento do teste e suas instruções são compreesíveis.
    */
    @Test(timeout = 4000)
    public void test04() throws Throwable {
        BinomialTest binomialTest0 = new BinomialTest();
        AlternativeHypothesis alternativeHypothesis0 = AlternativeHypothesis.TWO_SIDED;
        binomialTest0.binomialTest(0, 0, (double) 0, alternativeHypothesis0, 1.0);
    }

    /*
    * Informações do teste
    *
    * Plausível: não
    *      O único comportamento verificado é se o teste pode ser executado no tempo de 4s. O que não se demonstra plausível
    *     para um teste que instancia as classes e chama o um método.
    *
    * Compreensivel: sim
    *     - O comportamento do teste e suas instruções são compreesíveis.
    */
    @Test(timeout = 4000)
    public void test05() throws Throwable {
        AlternativeHypothesis alternativeHypothesis0 = AlternativeHypothesis.TWO_SIDED;
        BinomialTest binomialTest0 = new BinomialTest();
        // Undeclared exception!
        binomialTest0.binomialTest(3161, 1, 0.0, alternativeHypothesis0, (double) 62);
    }

    /*
    * Informações do teste
    *
    * Plausível: não
    *      O único comportamento verificado é se o teste pode ser executado no tempo de 4s. O que não se demonstra plausível
    *     para um teste que instancia as classes e chama o um método.
    *
    * Compreensivel: sim
    *     - O comportamento do teste e suas instruções são compreesíveis.
    */
    @Test(timeout = 4000)
    public void test06() throws Throwable {
        BinomialTest binomialTest0 = new BinomialTest();
        AlternativeHypothesis alternativeHypothesis0 = AlternativeHypothesis.TWO_SIDED;
        // Undeclared exception!
        binomialTest0.binomialTest(2363, 0, (double) 0, alternativeHypothesis0);
    }

    /*
    * Informações do teste
    *
    * Plausível: sim
    *     - O teste verifica dois comportamentos: primeiro se ele pode ser executado no tempo de 4s; Em seguida, se o resultado
    *     produzido pelo teste binomial é igual ao esperado.
    *
    * Compreensivel: sim
    *     - O comportamento do teste e suas instruções são compreesíveis.
    */
    @Test(timeout = 4000)
    public void test07() throws Throwable {
        BinomialTest binomialTest0 = new BinomialTest();
        AlternativeHypothesis alternativeHypothesis0 = AlternativeHypothesis.TWO_SIDED;
        double double0 = binomialTest0.binomialTest(1073, 1073, 0.0, alternativeHypothesis0);
        assertEquals(0.0, double0, 0.01);
    }

    /*
      * Informações do teste
      *
      * Plausível: não
      *     - O teste analisa comportamentos já verificados em outros testes.
      *
      * Compreensivel: sim
      *     - O comportamento do teste e suas instruções são compreesíveis.
      */
    @Test(timeout = 4000)
    public void test08() throws Throwable {
        BinomialTest binomialTest0 = new BinomialTest();
        AlternativeHypothesis alternativeHypothesis0 = AlternativeHypothesis.TWO_SIDED;
        double double0 = binomialTest0.binomialTest(0, 0, (double) 0, alternativeHypothesis0);
        assertEquals(1.0, double0, 0.01);
    }

    /*
    * Informações do teste
    *
    * Plausível: sim
    *     - O teste verifica dois comportamentos: primeiro se ele pode ser executado no tempo de 4s; Em seguida, se o resultado
    *     produzido pelo teste binomial é igual ao esperado.
    *
    * Compreensivel: sim
    *     - O comportamento do teste e suas instruções são compreesíveis.
    */
    @Test(timeout = 4000)
    public void test09() throws Throwable {
        BinomialTest binomialTest0 = new BinomialTest();
        AlternativeHypothesis alternativeHypothesis0 = AlternativeHypothesis.TWO_SIDED;
        double double0 = binomialTest0.binomialTest(4460, 0, 1.0, alternativeHypothesis0);
        assertEquals(0.0, double0, 0.01);
    }

    /*
    * Informações do teste
    *
    * Plausível: sim
    *     - O teste verifica dois comportamentos: primeiro se ele pode ser executado no tempo de 4s; Em seguida, se o resultado
    *     produzido pelo teste binomial é igual ao esperado.
    *
    * Compreensivel: sim
    *     - O comportamento do teste e suas instruções são compreesíveis.
    */
    @Test(timeout = 4000)
    public void test10() throws Throwable {
        BinomialTest binomialTest0 = new BinomialTest();
        AlternativeHypothesis alternativeHypothesis0 = AlternativeHypothesis.GREATER_THAN;
        double double0 = binomialTest0.binomialTest(1, 1, (double) 1, alternativeHypothesis0);
        assertEquals(1.0, double0, 0.01);
    }
    /*
    * Informações do teste
    *
    * Plausível: não
    *     - O teste verifica dois comportamentos: primeiro se ele pode ser executado no tempo de 4s; Em seguida, se a função
    *     binomialTest() chamada com argumentos ilegais lança uma NullPointerException. A documentação especifica que para erros
    *     nos valores passados uma NotPositiveException, OutOfRangeException ou MathIllegalArgumentException será lançada.
    *
    * Compreensivel: sim
    *     - O comportamento do teste e suas instruções são compreesíveis.
    */
    @Test(timeout = 4000)
    public void test11() throws Throwable {
        BinomialTest binomialTest0 = new BinomialTest();
        // Undeclared exception!
        try {
            binomialTest0.binomialTest(46, 46, 1.0, (AlternativeHypothesis) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // null is not allowed
            //
            verifyException("org.apache.commons.math4.stat.inference.BinomialTest", e);
        }
    }
    /*
    * Informações do teste
    *
    * Plausível: não
    *     - O teste verifica dois comportamentos: primeiro se ele pode ser executado no tempo de 4s; Em seguida, se a função
    *     binomialTest() chamada com argumentos ilegais lança uma RuntimeException. A documentação especifica que para erros
    *     nos valores passados uma NotPositiveException, OutOfRangeException ou MathIllegalArgumentException será lançada.
    *
    * Compreensivel: sim
    *     - O comportamento do teste e suas instruções são compreesíveis.
    */
    @Test(timeout = 4000)
    public void test12() throws Throwable {
        BinomialTest binomialTest0 = new BinomialTest();
        AlternativeHypothesis alternativeHypothesis0 = AlternativeHypothesis.GREATER_THAN;
        // Undeclared exception!
        try {
            binomialTest0.binomialTest(1, 2932, (double) 1, alternativeHypothesis0);
            fail("Expecting exception: RuntimeException");

        } catch (RuntimeException e) {
            //
            // must have n >= k for binomial coefficient (n, k), got k = 1, n = 2,932
            //
            verifyException("org.apache.commons.math4.stat.inference.BinomialTest", e);
        }
    }

    /*
    * Informações do teste
    *
    * Plausível: não
    *     - O teste verifica dois comportamentos: primeiro se ele pode ser executado no tempo de 4s; Em seguida, se a função
    *     binomialTest() chamada com argumentos ilegais lança uma RuntimeException. A documentação especifica que para erros
    *     nos valores passados uma NotPositiveException, OutOfRangeException ou MathIllegalArgumentException será lançada.
    *
    * Compreensivel: sim
    *     - O comportamento do teste e suas instruções são compreesíveis.
    */
    @Test(timeout = 4000)
    public void test13() throws Throwable {
        BinomialTest binomialTest0 = new BinomialTest();
        AlternativeHypothesis alternativeHypothesis0 = AlternativeHypothesis.TWO_SIDED;
        // Undeclared exception!
        try {
            binomialTest0.binomialTest(564, 564, (double) 564, alternativeHypothesis0);
            fail("Expecting exception: RuntimeException");

        } catch (RuntimeException e) {
            //
            // 564 out of [0, 1] range
            //
            verifyException("org.apache.commons.math4.stat.inference.BinomialTest", e);
        }
    }

    /*
    * Informações do teste
    *
    * Plausível: não
    *     - O teste verifica dois comportamentos: primeiro se ele pode ser executado no tempo de 4s; Em seguida, se a função
    *     binomialTest() chamada com argumentos ilegais lança uma RuntimeException. A documentação especifica que para erros
    *     nos valores passados uma NotPositiveException, OutOfRangeException ou MathIllegalArgumentException será lançada.
    *
    * Compreensivel: sim
    *     - O comportamento do teste e suas instruções são compreesíveis.
    */
    @Test(timeout = 4000)
    public void test14() throws Throwable {
        BinomialTest binomialTest0 = new BinomialTest();
        AlternativeHypothesis alternativeHypothesis0 = AlternativeHypothesis.GREATER_THAN;
        // Undeclared exception!
        try {
            binomialTest0.binomialTest(0, (-2897), (-4044.2746317560873), alternativeHypothesis0);
            fail("Expecting exception: RuntimeException");

        } catch (RuntimeException e) {
            //
            // -2,897 is smaller than the minimum (0)
            //
            verifyException("org.apache.commons.math4.stat.inference.BinomialTest", e);
        }
    }

    /*
    * Informações do teste
    *
    * Plausível: sim
    *     - O teste verifica dois comportamentos: primeiro se ele pode ser executado no tempo de 4s; Em seguida, se o resultado
    *     produzido pelo teste binomial é igual ao esperado.
    *
    * Compreensivel: sim
    *     - O comportamento do teste e suas instruções são compreesíveis.
    */
    @Test(timeout = 4000)
    public void test15() throws Throwable {
        BinomialTest binomialTest0 = new BinomialTest();
        AlternativeHypothesis alternativeHypothesis0 = AlternativeHypothesis.TWO_SIDED;
        double double0 = binomialTest0.binomialTest(2146887814, 2146887814, 0.22500661583621176, alternativeHypothesis0);
        assertEquals(0.0, double0, 0.01);
    }

    /*
    * Informações do teste
    *
    * Plausível: não
    *     - O teste verifica dois comportamentos: primeiro se ele pode ser executado no tempo de 4s; Em seguida, se a função
    *     binomialTest() chamada com argumentos ilegais lança uma RuntimeException. A documentação especifica que para erros
    *     nos valores passados uma NotPositiveException, OutOfRangeException ou MathIllegalArgumentException será lançada.
    *
    * Compreensivel: sim
    *     - O comportamento do teste e suas instruções são compreesíveis.
    */
    @Test(timeout = 4000)
    public void test16() throws Throwable {
        BinomialTest binomialTest0 = new BinomialTest();
        // Undeclared exception!
        try {
            binomialTest0.binomialTest(0, 0, (double) 0, (AlternativeHypothesis) null, (double) 0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // null is not allowed
            //
            verifyException("org.apache.commons.math4.stat.inference.BinomialTest", e);
        }
    }

    /*
    * Informações do teste
    *
    * Plausível: não
    *     - O teste verifica dois comportamentos: primeiro se ele pode ser executado no tempo de 4s; Em seguida, se a função
    *     binomialTest() chamada com argumentos ilegais lança uma RuntimeException. A documentação especifica que para erros
    *     nos valores passados uma NotPositiveException, OutOfRangeException ou MathIllegalArgumentException será lançada.
    *
    * Compreensivel: sim
    *     - O comportamento do teste e suas instruções são compreesíveis.
    */
    @Test(timeout = 4000)
    public void test17() throws Throwable {
        BinomialTest binomialTest0 = new BinomialTest();
        AlternativeHypothesis alternativeHypothesis0 = AlternativeHypothesis.TWO_SIDED;
        // Undeclared exception!
        try {
            binomialTest0.binomialTest(0, 2026, (double) 0, alternativeHypothesis0, (-159.02164163778198));
            fail("Expecting exception: RuntimeException");

        } catch (RuntimeException e) {
            //
            // must have n >= k for binomial coefficient (n, k), got k = 0, n = 2,026
            //
            verifyException("org.apache.commons.math4.stat.inference.BinomialTest", e);
        }
    }

    /*
    * Informações do teste
    *
    * Plausível: não
    *     - O teste verifica dois comportamentos: primeiro se ele pode ser executado no tempo de 4s; Em seguida, se a função
    *     binomialTest() chamada com argumentos ilegais lança uma RuntimeException. A documentação especifica que para erros
    *     nos valores passados uma NotPositiveException, OutOfRangeException ou MathIllegalArgumentException será lançada.
    *
    * Compreensivel: sim
    *     - O comportamento do teste e suas instruções são compreesíveis.
    */
    @Test(timeout = 4000)
    public void test18() throws Throwable {
        BinomialTest binomialTest0 = new BinomialTest();
        AlternativeHypothesis alternativeHypothesis0 = AlternativeHypothesis.TWO_SIDED;
        // Undeclared exception!
        try {
            binomialTest0.binomialTest(253, 253, (double) 253, alternativeHypothesis0, (double) 253);
            fail("Expecting exception: RuntimeException");

        } catch (RuntimeException e) {
            //
            // 253 out of [0, 1] range
            //
            verifyException("org.apache.commons.math4.stat.inference.BinomialTest", e);
        }
    }

    /*
    * Informações do teste
    *
    * Plausível: não
    *     - O teste verifica dois comportamentos: primeiro se ele pode ser executado no tempo de 4s; Em seguida, se a função
    *     binomialTest() chamada com argumentos ilegais lança uma RuntimeException. A documentação especifica que para erros
    *     nos valores passados uma NotPositiveException, OutOfRangeException ou MathIllegalArgumentException será lançada.
    *
    * Compreensivel: sim
    *     - O comportamento do teste e suas instruções são compreesíveis.
    */
    @Test(timeout = 4000)
    public void test19() throws Throwable {
        BinomialTest binomialTest0 = new BinomialTest();
        AlternativeHypothesis alternativeHypothesis0 = AlternativeHypothesis.GREATER_THAN;
        // Undeclared exception!
        try {
            binomialTest0.binomialTest(332, 332, (double) (-4313), alternativeHypothesis0);
            fail("Expecting exception: RuntimeException");

        } catch (RuntimeException e) {
            //
            // -4,313 out of [0, 1] range
            //
            verifyException("org.apache.commons.math4.stat.inference.BinomialTest", e);
        }
    }

    /*
    * Informações do teste
    *
    * Plausível: não
    *     - O teste verifica dois comportamentos: primeiro se ele pode ser executado no tempo de 4s; Em seguida, se a função
    *     binomialTest() chamada com argumentos ilegais lança uma RuntimeException. A documentação especifica que para erros
    *     nos valores passados uma NotPositiveException, OutOfRangeException ou MathIllegalArgumentException será lançada.
    *
    * Compreensivel: sim
    *     - O comportamento do teste e suas instruções são compreesíveis.
    */
    @Test(timeout = 4000)
    public void test20() throws Throwable {
        BinomialTest binomialTest0 = new BinomialTest();
        AlternativeHypothesis alternativeHypothesis0 = AlternativeHypothesis.LESS_THAN;
        // Undeclared exception!
        try {
            binomialTest0.binomialTest(1, (-2473), (double) 1, alternativeHypothesis0, (double) 1);
            fail("Expecting exception: RuntimeException");

        } catch (RuntimeException e) {
            //
            // -2,473 is smaller than the minimum (0)
            //
            verifyException("org.apache.commons.math4.stat.inference.BinomialTest", e);
        }
    }

    /*
    * Informações do teste
    *
    * Plausível: não
    *     - O teste analisa comportamentos já verificados em outros testes.
    *
    * Compreensivel: sim
    *     - O comportamento do teste e suas instruções são compreesíveis.
    */
    @Test(timeout = 4000)
    public void test21() throws Throwable {
        BinomialTest binomialTest0 = new BinomialTest();
        AlternativeHypothesis alternativeHypothesis0 = AlternativeHypothesis.GREATER_THAN;
        boolean boolean0 = binomialTest0.binomialTest(332, 332, (double) 0, alternativeHypothesis0, (double) 332);
        assertTrue(boolean0);
    }
}
